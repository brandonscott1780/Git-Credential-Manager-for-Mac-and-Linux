package com.microsoft.alm.java.git_credential_helper.authentication;

import com.microsoft.alm.java.git_credential_helper.helpers.NotImplementedException;

class VsoAdalTokenCache // TODO: extends TokenCache
{
    private static final String AdalCachePath = "Microsoft\\VSCommon\\VSAccountManagement";
    private static final String AdalCacheFile = "AdalCache.cache";

    /**
     * Default constructor.
     */
    public VsoAdalTokenCache()
    {
        throw new NotImplementedException();
    }

    /**
     * Constructor receiving state of the cache.
     *
     * @param state Current state of the cache as a blob.
     */
    public VsoAdalTokenCache(final byte[] state)
    {
        throw new NotImplementedException();
    }

    private final String _cacheFilePath;

    private final Object lock = new Object();

    // TODO: arguments should be TokenCacheNotificationArgs
    private void afterAccessNotification(final Object args)
    {
        throw new NotImplementedException();
    }


    private void beforeAccessNotification(final Object args)
    {
        throw new NotImplementedException();
    }
}
