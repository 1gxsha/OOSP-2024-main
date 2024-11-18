import models.ImageCacheManager;

public class Main {
    public static void main(String[] args) {
        ImageCacheManager cacheManager = ImageCacheManager.getInstance();


        byte[] imageData1 = new byte[]{1, 2, 3};
        cacheManager.addImageToCache("image1.png", imageData1);


        if (cacheManager.isImageInCache("image1.png")) {
            System.out.println("Image1 is in cache.");
        }


        byte[] cachedImageData = cacheManager.getImageFromCache("image1.png");
        System.out.println("Cached image data: " + cachedImageData);


        cacheManager.removeImageFromCache("image1.png");
        System.out.println("Image1 removed from cache.");


        cacheManager.clearCache();
        System.out.println("Cache cleared.");
    }}