package com.bookclub.service.dao;

import com.bookclub.model.WishlistItem;
import main.java.com.bookclub.service.GenericDao;

public interface WishlistDao extends GenericDao<WishlistItem, String> {
    void add(WishlistItem wishlistItem);
}
