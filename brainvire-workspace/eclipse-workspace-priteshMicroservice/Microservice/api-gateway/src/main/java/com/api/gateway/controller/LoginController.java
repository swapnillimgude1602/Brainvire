package com.api.gateway.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.payload.AuthResponse;

@RestController
@RequestMapping(path = "/auth")
public class LoginController {

	public Logger logger = LoggerFactory.getLogger(LoginController.class);

	@GetMapping(path = "/login")
	public ResponseEntity<AuthResponse> login(
			@RegisteredOAuth2AuthorizedClient("okta") OAuth2AuthorizedClient auth2AuthorizedClient,
			@AuthenticationPrincipal OidcUser oidcUser, Model model) {
		logger.info(oidcUser.getEmail());

		List<String> authorities = oidcUser.getAuthorities().stream().map(auth -> {
			return auth.getAuthority();
		}).collect(Collectors.toList());

		AuthResponse authResponse = AuthResponse.builder().userId(oidcUser.getEmail())
				.accessToken(auth2AuthorizedClient.getAccessToken().getTokenValue())
				.refreshToken(auth2AuthorizedClient.getRefreshToken().getTokenValue())
				.expireAt(auth2AuthorizedClient.getAccessToken().getExpiresAt().getEpochSecond())
				.authorities(authorities).build();

		return new ResponseEntity<AuthResponse>(authResponse, HttpStatus.OK);
	}
}
