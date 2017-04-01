package tools.hub.com.simple_infinite_view_pager;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public class MyApp extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(MyApp.this).memoryCacheSizePercentage(20).discCacheFileCount(1000).discCacheSize(5 * 1024 * 1024).defaultDisplayImageOptions(getOptions()).memoryCacheExtraOptions(480, 800).build();
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(configuration);
    }

    private DisplayImageOptions getOptions(){
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheOnDisc(true).showImageOnLoading(R.mipmap.ic_launcher)
                .showImageForEmptyUri(R.mipmap.ic_launcher).cacheInMemory(true).build();
        return options;
    }

}
