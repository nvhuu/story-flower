package storysflower.com.storysflower.services;

import storysflower.com.storysflower.dto.ImageDTO;

/**
 * @author ntynguyen
 */
public interface ImageService {
    public ImageDTO findImageById(Long id);
}
