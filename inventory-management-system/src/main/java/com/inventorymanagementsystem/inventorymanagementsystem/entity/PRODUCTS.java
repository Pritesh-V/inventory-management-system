package com.inventorymanagementsystem.inventorymanagementsystem.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class PRODUCTS {
    @Id  
    @GeneratedValue
	private Integer PRODUCT_Id;
    @Column
    private int VENDOR_Id;
    @Column
    private int CATEGORY_id;
    @Column
    private int SUB_CATEGORY_id;
    @Column
    private String PRODUCT_name;
    @Column
    private String PRODUCT_Brand;
    @Column
    private int PRODUCT_Weight;
    @Column
    private int PRODUCT_Size;
    @Column
    private String PRODUCT_Color;
    @Column
    private String PRODUCT_Material;
    @Column
    private String PRODUCT_Details;
    @Column
    private int PRODUCT_Prize;
    @Column
    private int PRODUCT_Quantity;
    @Column
    private int PRODUCT_LOT_no;
    @Column
    private String PRODUCT_LOT_Size;
    @Column
    private int PRODUCT_LOT_prize;
    @Column
    private int PRODUCT_LOT_Quantity;
    @Column
    private int PRODUCT_LOT_Quantity_prize;
    @Column 
    private LocalDate PRODUCT_Arrival_Date;
    
 // Constructer 
    
    
    public PRODUCTS() {
    	
    }
    
    
	public PRODUCTS(Integer pRODUCT_Id, int vENDOR_Id, int cATEGORY_id, int sUB_CATEGORY_id, String pRODUCT_name,
			String pRODUCT_Brand, int pRODUCT_Weight, int pRODUCT_Size, String pRODUCT_Color, String pRODUCT_Material,
			String pRODUCT_Details, int pRODUCT_Prize, int pRODUCT_Quantity, int pRODUCT_LOT_no,
			String pRODUCT_LOT_Size, int pRODUCT_LOT_prize, int pRODUCT_LOT_Quantity, int pRODUCT_LOT_Quantity_prize,
			LocalDate pRODUCT_Arrival_Date) {
		super();
		PRODUCT_Id = pRODUCT_Id;
		VENDOR_Id = vENDOR_Id;
		CATEGORY_id = cATEGORY_id;
		SUB_CATEGORY_id = sUB_CATEGORY_id;
		PRODUCT_name = pRODUCT_name;
		PRODUCT_Brand = pRODUCT_Brand;
		PRODUCT_Weight = pRODUCT_Weight;
		PRODUCT_Size = pRODUCT_Size;
		PRODUCT_Color = pRODUCT_Color;
		PRODUCT_Material = pRODUCT_Material;
		PRODUCT_Details = pRODUCT_Details;
		PRODUCT_Prize = pRODUCT_Prize;
		PRODUCT_Quantity = pRODUCT_Quantity;
		PRODUCT_LOT_no = pRODUCT_LOT_no;
		PRODUCT_LOT_Size = pRODUCT_LOT_Size;
		PRODUCT_LOT_prize = pRODUCT_LOT_prize;
		PRODUCT_LOT_Quantity = pRODUCT_LOT_Quantity;
		PRODUCT_LOT_Quantity_prize = pRODUCT_LOT_Quantity_prize;
		PRODUCT_Arrival_Date = pRODUCT_Arrival_Date;
	}
	
	// getter and setters 


	public Integer getPRODUCT_Id() {
		return PRODUCT_Id;
	}


	public void setPRODUCT_Id(Integer pRODUCT_Id) {
		PRODUCT_Id = pRODUCT_Id;
	}


	public int getVENDOR_Id() {
		return VENDOR_Id;
	}


	public void setVENDOR_Id(int vENDOR_Id) {
		VENDOR_Id = vENDOR_Id;
	}


	public int getCATEGORY_id() {
		return CATEGORY_id;
	}


	public void setCATEGORY_id(int cATEGORY_id) {
		CATEGORY_id = cATEGORY_id;
	}


	public int getSUB_CATEGORY_id() {
		return SUB_CATEGORY_id;
	}


	public void setSUB_CATEGORY_id(int sUB_CATEGORY_id) {
		SUB_CATEGORY_id = sUB_CATEGORY_id;
	}


	public String getPRODUCT_name() {
		return PRODUCT_name;
	}


	public void setPRODUCT_name(String pRODUCT_name) {
		PRODUCT_name = pRODUCT_name;
	}


	public String getPRODUCT_Brand() {
		return PRODUCT_Brand;
	}


	public void setPRODUCT_Brand(String pRODUCT_Brand) {
		PRODUCT_Brand = pRODUCT_Brand;
	}


	public int getPRODUCT_Weight() {
		return PRODUCT_Weight;
	}


	public void setPRODUCT_Weight(int pRODUCT_Weight) {
		PRODUCT_Weight = pRODUCT_Weight;
	}


	public int getPRODUCT_Size() {
		return PRODUCT_Size;
	}


	public void setPRODUCT_Size(int pRODUCT_Size) {
		PRODUCT_Size = pRODUCT_Size;
	}


	public String getPRODUCT_Color() {
		return PRODUCT_Color;
	}


	public void setPRODUCT_Color(String pRODUCT_Color) {
		PRODUCT_Color = pRODUCT_Color;
	}


	public String getPRODUCT_Material() {
		return PRODUCT_Material;
	}


	public void setPRODUCT_Material(String pRODUCT_Material) {
		PRODUCT_Material = pRODUCT_Material;
	}


	public String getPRODUCT_Details() {
		return PRODUCT_Details;
	}


	public void setPRODUCT_Details(String pRODUCT_Details) {
		PRODUCT_Details = pRODUCT_Details;
	}


	public int getPRODUCT_Prize() {
		return PRODUCT_Prize;
	}


	public void setPRODUCT_Prize(int pRODUCT_Prize) {
		PRODUCT_Prize = pRODUCT_Prize;
	}


	public int getPRODUCT_Quantity() {
		return PRODUCT_Quantity;
	}


	public void setPRODUCT_Quantity(int pRODUCT_Quantity) {
		PRODUCT_Quantity = pRODUCT_Quantity;
	}


	public int getPRODUCT_LOT_no() {
		return PRODUCT_LOT_no;
	}


	public void setPRODUCT_LOT_no(int pRODUCT_LOT_no) {
		PRODUCT_LOT_no = pRODUCT_LOT_no;
	}


	public String getPRODUCT_LOT_Size() {
		return PRODUCT_LOT_Size;
	}


	public void setPRODUCT_LOT_Size(String pRODUCT_LOT_Size) {
		PRODUCT_LOT_Size = pRODUCT_LOT_Size;
	}


	public int getPRODUCT_LOT_prize() {
		return PRODUCT_LOT_prize;
	}


	public void setPRODUCT_LOT_prize(int pRODUCT_LOT_prize) {
		PRODUCT_LOT_prize = pRODUCT_LOT_prize;
	}


	public int getPRODUCT_LOT_Quantity() {
		return PRODUCT_LOT_Quantity;
	}


	public void setPRODUCT_LOT_Quantity(int pRODUCT_LOT_Quantity) {
		PRODUCT_LOT_Quantity = pRODUCT_LOT_Quantity;
	}


	public int getPRODUCT_LOT_Quantity_prize() {
		return PRODUCT_LOT_Quantity_prize;
	}


	public void setPRODUCT_LOT_Quantity_prize(int pRODUCT_LOT_Quantity_prize) {
		PRODUCT_LOT_Quantity_prize = pRODUCT_LOT_Quantity_prize;
	}


	public LocalDate getPRODUCT_Arrival_Date() {
		return PRODUCT_Arrival_Date;
	}


	public void setPRODUCT_Arrival_Date(LocalDate pRODUCT_Arrival_Date) {
		PRODUCT_Arrival_Date = pRODUCT_Arrival_Date;
	}

	
	
	// tostrng method

	@Override
	public String toString() {
		return "PRODUCTS [PRODUCT_Id=" + PRODUCT_Id + ", VENDOR_Id=" + VENDOR_Id + ", CATEGORY_id=" + CATEGORY_id
				+ ", SUB_CATEGORY_id=" + SUB_CATEGORY_id + ", PRODUCT_name=" + PRODUCT_name + ", PRODUCT_Brand="
				+ PRODUCT_Brand + ", PRODUCT_Weight=" + PRODUCT_Weight + ", PRODUCT_Size=" + PRODUCT_Size
				+ ", PRODUCT_Color=" + PRODUCT_Color + ", PRODUCT_Material=" + PRODUCT_Material + ", PRODUCT_Details="
				+ PRODUCT_Details + ", PRODUCT_Prize=" + PRODUCT_Prize + ", PRODUCT_Quantity=" + PRODUCT_Quantity
				+ ", PRODUCT_LOT_no=" + PRODUCT_LOT_no + ", PRODUCT_LOT_Size=" + PRODUCT_LOT_Size
				+ ", PRODUCT_LOT_prize=" + PRODUCT_LOT_prize + ", PRODUCT_LOT_Quantity=" + PRODUCT_LOT_Quantity
				+ ", PRODUCT_LOT_Quantity_prize=" + PRODUCT_LOT_Quantity_prize + ", PRODUCT_Arrival_Date="
				+ PRODUCT_Arrival_Date + "]";
	}
    
    
    
	
	
	
    
    
    
	
}
