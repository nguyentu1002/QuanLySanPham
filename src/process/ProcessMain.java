/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import frm.frmTrangChu;

/**
 *
 * @author Chinh
 */
public class ProcessMain {

    //Khai bao frm trang chu. khi chay form dang nhap xong se hien thi len frm trang chu.
    public static frm.frmTrangChu frmTC = new frmTrangChu();
    public static database.clsConnectDB connection = new database.clsConnectDB();

    public static void main(String[] args) {
        frm.frmDangNhap frmDN = new frm.frmDangNhap();
        frmDN.show();
    }

}
