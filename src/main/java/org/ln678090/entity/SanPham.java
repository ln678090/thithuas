package org.ln678090.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    int idSP;
    String ten;
    int soLuong;
    double donGia;
    String moTa;
}
