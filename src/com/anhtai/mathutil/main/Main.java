/*
<<<<<<< HEAD
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
=======
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
>>>>>>> cfde85e68c67c9f160cc804b7396bc247f49b556
 */
package com.anhtai.mathutil.main;

import com.anhtai.mathutil.core.MathUtil;

/**
 *
<<<<<<< HEAD
 * @author LENOVO
=======
 * @author admin
>>>>>>> cfde85e68c67c9f160cc804b7396bc247f49b556
 */
public class Main {
    public static void main(String[] args) {
        
<<<<<<< HEAD
        //thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
        //ta phải đưa các tình huống sử dụng hàm trong thực tế
        //ví dụ: -5 coi tính đc ko
        //      0 coi tính mấy
        //      20 coi tính mấy
        //      21 coi tính mấy
        //TEST CASE: Một tình huống hàm/app/màn hình/ tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE là 1 tình huống sử dụng app, xài app(hàm) mà nó bao hàm/gồm: 
        //INPUT: data đầu vào cụ thể nào đó
        //OUPUT: ĐẦU RA ỨNG VS XỬ LÝ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÝ
        //KỲ VỌNG:MONG HÀM TRẢ VỀ VALUE NÀO ĐÓ ỨNG VS INPUT Ở TRÊN
        //SOSANH ĐỂ XEM KÉT QUẢ CÓ NHƯ KỲ VỌNG HAY KO
        
        long expected = 120; //tao kì vọng hàm ói về 120 nếu tính 5!
        int n = 5;      //input
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected.");
        System.out.println("5! = " + actual + " actual.");
=======
        
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
        
>>>>>>> cfde85e68c67c9f160cc804b7396bc247f49b556
    }
}
