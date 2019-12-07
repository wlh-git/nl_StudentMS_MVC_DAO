package com.tools.execl;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ReadExcel {
	// ��ȡ�����
	public String[][] readExcelFill_ins() throws Exception {
		String[][] info = null;
		File file = new File("E:" + File.separator + "fill_ins.xls");
		/*
		 * if(file.isFile()) if (!file.exists()) {
		 * 
		 * }
		 */
		@SuppressWarnings("unused")
		InputStream is = null;
		Workbook wb = null;
		try {
			// ����������,��ȡexcel
			is = new FileInputStream(file);
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// ÿ��ҳǩ����һ��Sheet����
		Sheet sheet = wb.getSheet(0);
		// sheet.getRows()���ظ�ҳ��������
		int rows = sheet.getRows();
		// ����һ����ά��������������Ϣ
		info = new String[rows][2];
		for (int j = 0; j < rows; j++) {
			// ����ÿһ�����е�Ԫ�����Ϣ
			Cell[] cells = sheet.getRow(j);
			for (int k = 0; k < cells.length; k++) {
				// ��ÿһ����Ԫ����Ϣ��info��
				info[j][k] = cells[k].getContents().trim();
			}
		}
		return info;
	}

	// ��ȡѡ����
	public String[][] readExcelOptions() throws Exception {
		File file = new File("D:" + File.separator + "options.xls");
		@SuppressWarnings("unused")
		InputStream is = null;
		Workbook wb = null;
		try {
			// ����������,��ȡexcel
			is = new FileInputStream(file);
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ϊÿһ��ҳǩ����һ��sheet����
		Sheet sheet = wb.getSheet(0);
		// ��ȡ������
		int rows = sheet.getRows();
		// ����һ����ά��������������Ϣ
		String[][] info = new String[rows][6];
		for (int j = 0; j < rows; j++) {
			// ��ȡÿһ�����еĵ�Ԫ�����Ϣ
			Cell[] cells = sheet.getRow(j);
			for (int k = 0; k < cells.length; k++) {
				// ��ÿһ����Ԫ����Ϣ��info��
				info[j][k] = cells[k].getContents().trim();
			}
		}
		return info;
	}

	// ��ȡָ���ļ��ĵ�һ��ҳǩ
	public String[][] readExcel(File file) throws Exception {
		@SuppressWarnings("unused")
		InputStream is = null;
		Workbook wb = null;
		try {
			// ����������,��ȡexcel
			is = new FileInputStream(file);
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ϊÿһ��ҳǩ���󴴽�һ��sheet����
		Sheet sheet = wb.getSheet(0);
		// ��ȡ������
		int rows = sheet.getRows();
		// ����һ����ά��������������Ϣ
		String[][] info = new String[rows][6];
		for (int j = 0; j < rows; j++) {
			// ��ȡÿһ�����еĵ�Ԫ�����Ϣ
			Cell[] cells = sheet.getRow(j);
			for (int k = 0; k < cells.length; k++) {
				// ����Ԫ����Ϣ�洢�����ά������
				info[j][k] = cells[k].getContents().trim();
			}
		}
		return info;
	}

	/*
	 * // ��ȡѡ�����ָ���� public String[][] readExcel_option(File file, int id) throws
	 * Exception {
	 * 
	 * @SuppressWarnings("unused") InputStream is = null; Workbook wb = null; try {
	 * // �����ļ�������,��ȡexcel is = new FileInputStream(file); wb =
	 * Workbook.getWorkbook(file); } catch (Exception e) { e.printStackTrace(); } //
	 * Ϊָ����ҳǩ����һ��sheet���� Sheet sheet = wb.getSheet(0); // ����һ����ά��������������Ϣ String[][]
	 * info = new String[4][6]; int num = 4 * id; for (int j = num,m=0; j < (num+4)
	 * && m<4; j++,m++) { // ��ȡÿһ�е����еĵ�Ԫ�����Ϣ Cell[] cells = sheet.getRow(j); for
	 * (int k = 0; k < cells.length; k++) { // ����Ϣ�洢�����ά������ info[m][k] =
	 * cells[k].getContents().trim(); } } return info; }
	 */
	// ��ȡ��������
	public String[][] readExcel_fill(File file, int id) throws Exception {
		@SuppressWarnings("unused")
		InputStream is = null;
		Workbook wb = null;
		try {
			// �����ļ�������,��ȡexcel
			is = new FileInputStream(file);
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ϊָ����ҳǩ����һ��sheet����
		Sheet sheet = wb.getSheet(0);
		// ����һ����ά��������������Ϣ
		String[][] info = new String[4][2];
		int num = 4 * id;
		for (int j = num,m=0; j < (num+4) && m<4; j++,m++) {
			// ��ȡÿһ�е����еĵ�Ԫ�����Ϣ
			Cell[] cells = sheet.getRow(j);
			for (int k = 0; k < cells.length; k++) {
				// ����Ϣ�洢�����ά������
				info[m][k] = cells[k].getContents().trim();
			}
		}
		return info;
	}
	
	// ��ȡ���������
		public String[][] readExcel_prom(File file, int id) throws Exception {
			@SuppressWarnings("unused")
			InputStream is = null;
			Workbook wb = null;
			try {
				// �����ļ�������,��ȡexcel
				is = new FileInputStream(file);
				wb = Workbook.getWorkbook(file);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Ϊָ����ҳǩ����һ��sheet����
			Sheet sheet = wb.getSheet(0);
			// ����һ����ά��������������Ϣ
			String[][] info = new String[2][2];
			int num = 2 * id;
			for (int j = num,m=0; j < (num+2)&&m<2; j++,m++) {
				// ��ȡÿһ�е����еĵ�Ԫ�����Ϣ
				Cell[] cells = sheet.getRow(j);
				for (int k = 0; k < cells.length; k++) {
					// ����Ϣ�洢�����ά������
					info[m][k] = cells[k].getContents().trim();
				}
			}
			return info;
		}

	// ��ȡָ���ļ���ָ��ҳǩ
	public String[][] readExcel(File file, int sheetAt) throws Exception {
		@SuppressWarnings("unused")
		InputStream is = null;
		Workbook wb = null;
		try {
			// �����ļ�������,��ȡexcel
			is = new FileInputStream(file);
			wb = Workbook.getWorkbook(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// Ϊָ����ҳǩ����һ��sheet����
		Sheet sheet = wb.getSheet(sheetAt);
		// ��ȡ������
		int rows = sheet.getRows();
		// ����һ����ά��������������Ϣ
		String[][] info = new String[rows][6];
		for (int j = 0; j < rows; j++) {
			// ��ȡÿһ�е����еĵ�Ԫ�����Ϣ
			Cell[] cells = sheet.getRow(j);
			for (int k = 0; k < cells.length; k++) {
				// ����Ϣ�洢�����ά������
				info[j][k] = cells[k].getContents().trim();
			}
		}
		return info;
	}
}