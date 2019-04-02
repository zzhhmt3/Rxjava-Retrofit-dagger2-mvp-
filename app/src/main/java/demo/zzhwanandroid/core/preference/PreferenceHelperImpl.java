/*
 *     (C) Copyright 2019, ForgetSky.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */

package demo.zzhwanandroid.core.preference;

import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

import demo.zzhwanandroid.app.WanAndroidApp;
import demo.zzhwanandroid.core.constant.Constants;

/**
 * @author ForgetSky
 * @date 19-3-7
 */
public class PreferenceHelperImpl implements PreferenceHelper {
    private final SharedPreferences mPreferences;
    @Inject
    PreferenceHelperImpl() {
        mPreferences = WanAndroidApp.getContext().getSharedPreferences(Constants.MY_SHARED_PREFERENCE, Context.MODE_PRIVATE);
    }

    @Override
    public void setLoginStatus(boolean isLogin) {
        mPreferences.edit().putBoolean(Constants.LOGIN_STATUS, isLogin).apply();
    }

    @Override
    public boolean getLoginStatus() {
        return mPreferences.getBoolean(Constants.LOGIN_STATUS, false);
    }

    @Override
    public void setLoginAccount(String account) {
        mPreferences.edit().putString(Constants.ACCOUNT, account).apply();
    }

    @Override
    public String getLoginAccount() {
        return mPreferences.getString(Constants.ACCOUNT, "");
    }

    @Override
    public void setNightMode(boolean isNightMode) {
        mPreferences.edit().putBoolean(Constants.NIGHT_MODE, isNightMode).apply();
    }

    @Override
    public boolean isNightMode() {
        return mPreferences.getBoolean(Constants.NIGHT_MODE, false);
    }
}
