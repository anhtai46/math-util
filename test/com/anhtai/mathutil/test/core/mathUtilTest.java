/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.anhtai.mathutil.test.core;

import com.anhtai.mathutil.core.MathUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author admin
 */
public class mathUtilTest {

    //đây là class sẽ sữ dụng các hàm của thư viện/framework JUnit
    //để kiểm thử/kiểm tra code chính - hàm tinh1GiaiThua() bên
    //class core,MathUtil
    //viet1 code để test code chính bên kia!!
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống, trả về ngon
    //ta sẽ xài hàm kiểu well - đưa 5!, 6! hong chơi đưa -5!, 30!
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0; //test thử tình huống tử tế chạy vào, mày phải chạy đúng
        long expected = 1; //hope 0! =1

        //long actual = ; //gọi hàm cần test bên core/app chính/core chính
        long actual = MathUtil.getFactorial(n);

        //so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        assertEquals(expected, actual);

        //gộp thêm vài case thành công/đưa đầu vào ngon!! hàm phải tính ngon
        assertEquals(1, MathUtil.getFactorial(1));
        assertEquals(2, MathUtil.getFactorial(2));
        assertEquals(6, MathUtil.getFactorial(3));
        assertEquals(24, MathUtil.getFactorial(4));
        assertEquals(120, MathUtil.getFactorial(5));

    }   //hàm giúp so sánh 2 gtri giống nhau hay không
    //nếu giống --> thảy màu xanh đẻn đường - đường thông, code ngon
    //                                      ít nhất cho 1 case đang test
    //nếu ko giống nhau --> thảy màu đỏ đèn đường, hàm ys expectd và actual ko giống nhau

}
