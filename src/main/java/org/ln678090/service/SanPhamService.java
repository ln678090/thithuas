package org.ln678090.service;

import org.ln678090.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private static List<SanPham> sanPhams = new ArrayList<>();

    public static List<SanPham> getAllSanPhams() {
        return sanPhams;
    }

    public static void addSanPham(SanPham sanPham) {
        try {
            if (sanPham.getTen() == null || sanPham.getMoTa() == null) {
                throw new IllegalArgumentException("err validate");
            }
            sanPhams.add(sanPham);
        } catch (Exception e) {
            throw new IllegalArgumentException("err validate");
        }
    }

    public SanPham sua(SanPham sanPham) {
        for (SanPham sp : sanPhams) {
            if (sp.getIdSP() == sanPham.getIdSP()) {
                sp.setTen(sanPham.getTen());
                sp.setSoLuong(sanPham.getSoLuong());
                sp.setDonGia(sanPham.getDonGia());
                sp.setMoTa(sanPham.getMoTa());
                return sp;
            }
        }
        throw new IllegalArgumentException("Không tìm thấy sản phẩm để sửa");
    }

}
