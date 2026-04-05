package com.csc483.assignment1.search;

/**
 * Utility class for product searching operations.
 */
public class SearchUtils {

    /**
     * Searches for a product by ID using sequential search.
     * @param products array of products
     * @param targetId target product ID
     * @return matching product or null if not found
     */
    public static Product sequentialSearchById(Product[] products, int targetId) {
        if (products == null) {
            return null;
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductId() == targetId) {
                return products[i];
            }
        }
        return null;
    }

    /**
     * Searches for a product by ID using binary search.
     * The array must already be sorted by product ID.
     * @param products sorted array of products
     * @param targetId target product ID
     * @return matching product or null if not found
     */
    public static Product binarySearchById(Product[] products, int targetId) {
        if (products == null) {
            return null;
        }

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (products[middle] != null && products[middle].getProductId() == targetId) {
                return products[middle];
            } else if (products[middle] != null && products[middle].getProductId() < targetId) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return null;
    }

    /**
     * Searches for a product by name using sequential search.
     * @param products array of products
     * @param targetName target product name
     * @return matching product or null if not found
     */
    public static Product searchByName(Product[] products, String targetName) {
        if (products == null || targetName == null) {
            return null;
        }

        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductName().equalsIgnoreCase(targetName)) {
                return products[i];
            }
        }
        return null;
    }
}
