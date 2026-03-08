package org.ln678090.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ln678090.entity.SanPham;

import static org.junit.jupiter.api.Assertions.*;

class SanPhamServiceTest {

    SanPhamService sanPhamService = new SanPhamService();
    @BeforeEach
    void setUp() {
        SanPhamService.getAllSanPhams().clear();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addSanPham() {
        SanPham sanPham = new SanPham(1, "Laptop", 10, 1000.0, "Máy tính xách tay");
        SanPhamService.addSanPham(sanPham);
        assertEquals(1, SanPhamService.getAllSanPhams().size());
    }
    @Test
    void addSanPhamloi() {

        String errorMessage = assertThrows(IllegalArgumentException.class, ()->{
            SanPham sanPham = new SanPham(1, null, 10, 1000.0, "Máy tính xách tay");
            SanPhamService.addSanPham(sanPham);
        }).getMessage();
        assertEquals("err validate", errorMessage);
    }
    @Test
    void suaSanPham() {

        SanPham sanPham = new SanPham(1, "Laptop", 10, 1000.0, "Máy tính xách tay");
        SanPhamService.addSanPham(sanPham);
        SanPham sanPhamSua = new SanPham(1, "Laptop mới", 20, 2000.0, "Máy tính xách tay mới");
       SanPham  sausua=  sanPhamService.sua(sanPhamSua);
       assertAll(
               ()->assertEquals("Laptop mới", sausua.getTen()),
               ()->assertEquals(20, sausua.getSoLuong()),
               ()->assertEquals(2000.0, sausua.getDonGia()),
               ()->assertEquals("Máy tính xách tay mới", sausua.getMoTa())
       );

    }
}