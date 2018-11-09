package library;

import java.io.Serializable;

public class libraryCard implements Serializable {
    private int cnum;
    private String rdotype="";
    private String txtfirst="";
    private String txtlast="";
    private String txtmiddle="";
    private String drpsuffix="";
    private String txtstreet="";
    private String txtcity="";
    private String txtzip="";
    private String drpnotice="";
    private String txtemail="";
    private String txtconemail="";
    private String txtphone="";
    private String txtcell="";
    private String chkopt="";
    private String drpbirthday="";
    private String drpbirthyear="";
    private String txtcap="";

    public libraryCard(int cnum, String txtlast)
    {
        this.cnum = cnum;
        this.txtlast = txtlast;


    }

    public int getCnum() {
        return cnum;
    }

    public String getTxtlast(){
        return txtlast;
    }
}

