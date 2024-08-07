package com.example.demo.JWTUtil;

import java.security.Key;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {
	public final String SECRET = "6Q7V/Z678JGPdYMlzAFUGi9E/Pfr1KU1E7TGUoQhA3R/BH3RrFtGDLlzOMIKPTH9";// "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKmmqmcdsuS3Rd/CODSGQRJsdg5MpxhRwSl+Hm90SD2IXJjkKcsCO4eBSTNYpcn7wN1f6MqtvK51KB+mYcYfcskCAwEAAQ==";

	public void validateToken(final String token) {
		Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token);
	}

	private Key getSignKey() {
		byte[] keyBytes = Decoders.BASE64.decode(SECRET);
		return Keys.hmacShaKeyFor(keyBytes);
	}

	public String extractUsername(String token) {
		return extractClaim(token, Claims::getSubject);

	}

	private <T> T extractClaim(String token, Function<Claims, T> claimResolver) {
		// TODO Auto-generated method stub
		final Claims claims = extractAllClaims(token);
		return claimResolver.apply(claims);
	}

	private Claims extractAllClaims(String token) {
		// TODO Auto-generated method stub
		return Jwts.parserBuilder().setSigningKey(getSignKey()).build().parseClaimsJws(token).getBody();
	}
}

