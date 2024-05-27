package com.bookclub.service;

import com.bookclub.model.Wishlist;
import com.bookclub.repository.WishlistRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class WishlistServiceTest {

    @Mock
    private WishlistRepository wishlistRepository;

    @InjectMocks
    private WishlistService wishlistService;

    @Test
    public void testGetWishlist() {
        when(wishlistRepository.findAll()).thenReturn(Collections.emptyList());

        List<Wishlist> wishlist = wishlistService.getWishlist();

        assertEquals(0, wishlist.size());
    }
}
