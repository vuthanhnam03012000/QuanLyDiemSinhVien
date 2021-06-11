/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Subject extends StudentMark {

    int stt;

    public Subject() {
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    @Override
    public String getTenMonHoc() {
        return tenMonHoc;
    }

    @Override
    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    @Override
    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMamh(int mamh) {
        this.maMonHoc = mamh;
    }

    public Object[] tooObjects() {
        return new Object[]{this.stt, this.maMonHoc, this.tenMonHoc};
    }


}
