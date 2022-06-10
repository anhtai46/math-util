/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anhtai.mathutil.main;

import com.anhtai.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        
        
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        //ta phải đưa ra các tình huống sử dụng hàm trong thực tế
        //vd: -5 coi tính đc ko
        //     0 coi tính mấy
        //    20 coi tính mấy
        //    21 coi-------
        //TEST CASE:  Một tình huống hàm/app/màn hình/tính năng đc vào sử dụng
        //giả lập hành vi xài của ai đó!!
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM
        //DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTOPUT ĐẦU RA ỨNG VỚI XỬ LÝ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG 
        //ĐÂU VÀO ĐỂ XỬ LÝ
        //KIF VỌNG:MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INOUT Ở TRÊN
        //SO SÁNH ĐỂ XEM XÉT KQ CÓ NHƯ KÌ VỌNG KO
        
        long expected = 120; //tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;          //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = "+ actual + " actual");
        
    }
}
