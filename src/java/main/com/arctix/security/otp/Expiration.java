package com.arctix.security.otp;

public interface Expiration
{
	public Integer getMaxAttempts();

	public Long getPasswordExpireInMinutes();
}
