package com.fenglian.app.financial;

import com.fenglian.app.financial.category.CategoryTabActivity;
import com.fenglian.app.financial.digest.DigestTabActivity;
import com.fenglian.app.financial.favorite.FavoriteTabActivity;
import com.fenglian.app.financial.infomation.InfomationTabActivity;
import com.fenglian.app.financial.setting.SettingTabActivity;
import com.fenglian.lib.base.BaseApplication;

public class AppApplication extends BaseApplication {

    @Override
    public void fillTabs() {
        mTabActivitys.add(InfomationTabActivity.class);
        mTabActivitys.add(CategoryTabActivity.class);
        mTabActivitys.add(DigestTabActivity.class);
        mTabActivitys.add(FavoriteTabActivity.class);
        mTabActivitys.add(SettingTabActivity.class);

        mTabNormalImages.add(R.drawable.infomation_normal);
        mTabNormalImages.add(R.drawable.category_normal);
        mTabNormalImages.add(R.drawable.digest_normal);
        mTabNormalImages.add(R.drawable.favorite_normal);
        mTabNormalImages.add(R.drawable.setting_normal);

        mTabPressImages.add(R.drawable.infomation_press);
        mTabPressImages.add(R.drawable.category_press);
        mTabPressImages.add(R.drawable.digest_press);
        mTabPressImages.add(R.drawable.favorite_press);
        mTabPressImages.add(R.drawable.setting_press);
    }

    @Override
    public void initDb() {
    }

    @Override
    public void initEnv() {
    }
}
