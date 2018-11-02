package com.arctix.security.otp;

public class DefaultExpiration implements Expiration
{

	@Override
	public Integer getMaxAttempts()
	{
		return 5;
	}

	@Override
	public Long getPasswordExpireInMinutes()
	{
		return 15L;
	}

}
