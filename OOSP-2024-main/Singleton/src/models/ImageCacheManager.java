package models;

import java.util.HashMap;
import java.util.Map;

public class ImageCacheManager {
    private Map<String, byte[]> imageCache;
    private static ImageCacheManager instance;

    private ImageCacheManager() {
        imageCache = new HashMap<>();
    }

    public static ImageCacheManager getInstance() {
        if (instance == null) {
            instance = new ImageCacheManager();
        }
        return instance;
    }

    public void addImageToCache(String imageName, byte[] imageData) {
        imageCache.put(imageName, imageData);
    }

    public byte[] getImageFromCache(String imageName) {
        return imageCache.get(imageName);
    }

    public boolean isImageInCache(String imageName) {
        return imageCache.containsKey(imageName);
    }

    public void removeImageFromCache(String imageName) {
        imageCache.remove(imageName);
    }

    public void clearCache() {
        imageCache.clear();
    }

    @Override
    public String toString() {
        return "ImageCacheManager{" +
                "imageCache=" + imageCache.keySet() +
                '}';
    }
}