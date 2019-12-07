package com.tools.execl;
import java.io.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
/**
 * @author Administrator
 * @param file
 * E:\result.xls sheetAt 0:ѡ���� sheetAt 1:����� sheetAt 2:�����
 */
public class OutputExcel {
	private	FileInputStream fs;		//�ļ�����������
	private	POIFSFileSystem ps;		// ʹ��POI�ṩ�ķ����õ�excel����Ϣ
	private FileOutputStream fos;//�ļ����������
	private HSSFWorkbook workbook = null;//excel�ĵ�����
	private HSSFSheet sheet ;//excel��sheet
	private HSSFRow row    ;//excel����
	private HSSFCell cell  ;//excel�ĵ�Ԫ��
	private boolean flag ;
	public static void main(String[] args) {
		String[] info = { "zhangsan", "A", "B", "C", "D" };
		try {
			OutputExcel t = new OutputExcel() ;
			t.doOutputExcel(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings("deprecation")
	public void doOutputExcel(String[] info) {
		StringBuffer result = null;
		File file = new File("E:" + File.separator + "test.xls");
		doCheck(file,info);
		conn(file);
		sheet = workbook.getSheetAt(0);
		int count = doCheck() ;
		for (int i = 0; i < info.length; i++) {
			try {
				row = sheet.getRow(i) ;
				cell = row.createCell(count) ;
				cell.setCellValue(info[i]) ;
				result = new StringBuffer("������Ϣ�ѳ���" + file + "����");
			} catch (Exception e) {
				System.out.println(i + "�ͻ��𰸳���" + e.getMessage());
				e.printStackTrace();
			}
		}
		try {
			fos = new FileOutputStream(file);
			fos.flush();
			workbook.write(fos);
			System.out.println(result);
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		doWrite(file);
		System.out.println(result);
		close();
	}
	
	/**
	 * ����:����ѡ�������Excel����(sheetAt=0)
	 * @param info
	 * @throws Exception
	 */
	public void makeExcelOptions(String[] info) throws Exception {
		File file = new File("E:" + File.separator + "result.xls");
		doCheck(file,info);
		conn(file);
		sheet = workbook.getSheetAt(0);
		int count = 1;
		flag = true;
		row = sheet.getRow(0);
		//�жϴӵڼ��п�ʼ����
		while (flag) {
			try {
				cell = row.getCell(count);
				if (row.getCell(count) == null) {
					flag = false;
					break;
				}
			} catch (Exception e) {
				flag = false;
				break;
			}
			count++;
		}
		for (int i = 0; i < info.length; i++) {
			try {
				row = sheet.getRow(i);
				cell = row.createCell(count);
				//cell.setCellValue(info[i]);
				cell.setCellValue(new HSSFRichTextString(info[i]));
			} catch (Exception e) {
				System.out.println(i + "�ͻ��𰸳���" + e.getMessage());
			}
		}
		doWrite(file);
		close();
	}

	/**
	 * ����:������������Excel����(sheetAt=1)
	 * @param info
	 * @throws Exception
	 */
	public void makeExcelFill_ins(String[] info) throws Exception {
		File file = new File("E:" + File.separator + "result.xls");
		doCheck(file,info);
		conn(file);
		sheet = workbook.getSheetAt(1);
		int count = 1;
		flag = true;
		row = sheet.getRow(0);
		while (flag) {
			try {
				cell = row.getCell(count);
				if (row.getCell(count) == null) {
					flag = false;
					break;
				}
			} catch (Exception e) {
				flag = false;
				break;
			}
			count++;
		}
		for (int i = 0; i < info.length; i++) {
			try {
				row = sheet.getRow(i);
				cell = row.createCell(count);
				//cell.setCellValue(info[i]);
				cell.setCellValue(new HSSFRichTextString(info[i]));
			} catch (Exception e) {
				System.out.println(i + "�ͻ��𰸳���" + e.getMessage());
			}
		}
		doWrite(file);
		close();
	}
	
	/**
	 * @param file �ļ�·��
	 * @param sheetAt ��i��sheet��
	 * @param info ���������
	 * @throws Exception
	 */
	public void memoryExcel(File file, int sheetAt, String[] info) throws Exception {		
		doCheck(file,info);
		conn(file);
		sheet = workbook.getSheetAt(sheetAt);
		/*
		 * �жϵ�һ�е���Ŀ����Ƿ���,���û�о������
		 */
		int count = 1;
		flag = true;
		row = sheet.getRow(0);
		while (flag) {
			try {
				cell = row.getCell(count);
				if (row.getCell(count) == null) {
					flag = false;
					break;
				}
			} catch (Exception e) {
				flag = false;
				break;
			}
			count++;
		}
		for (int i = 0; i < info.length; i++) {
			try {
				row = sheet.getRow(i);
				cell = row.createCell(count);
				//cell.setCellValue(info[i]);
				cell.setCellValue(new HSSFRichTextString(info[i]));
			} catch (Exception e) {
				System.out.println(i + "�ͻ��𰸳���" + e.getMessage());
			}
		}
		doWrite(file);
		close() ;
	}
	
	/**
	 * Ĭ�ϵ�һ��sheet���;
	 * @param file
	 * @param info
	 * @throws Exception
	 */
	public void memoryExcel(File file, String[] info) throws Exception {		
		StringBuffer result = null;
		doCheck(file,info);
		conn(file);
		sheet = workbook.getSheetAt(0);
		int count = 1;
		flag = true;
		row = sheet.getRow(0);
		while (flag) {
			try {
				cell = row.getCell(count);
				if (row.getCell(count) == null) {
					flag = false;
					break;
				}
			} catch (Exception e) {
				flag = false;
				break;
			}
			count++;
		}
		/*
		 * ��ʼ����ͻ�����Ϣ
		 */
		for (int i = 0; i < info.length; i++) {
			try {
				row = sheet.getRow(i);
				cell = row.createCell(count);
				//cell.setCellValue(info[i]);
				cell.setCellValue(new HSSFRichTextString(info[i]));
				result = new StringBuffer("������Ϣ�ѳ���" + file + "����");
			} catch (Exception e) {
				System.out.println(i + "�ͻ��𰸳���" + e.getMessage());
			}
		}

		doWrite(file);
		System.out.println(result);
		close() ;
	}
	
	private void doCheck(File file,String[] info) {
		conn(file);
		sheet = workbook.getSheetAt(0);
		boolean flag ;
		flag = false ;
		row = sheet.getRow(info.length - 2);
		try {
			if (row.getCell(0) == null) {
				flag = true;
				System.out.println("��ֵ");
			}
		} catch (Exception e) {
			flag = true;
		}
		if (flag) {
			for (int i = 0; i < info.length; i++) {
				try {
					row = sheet.createRow(i);
					cell = row.createCell(0);
					if (i==0) {
						//cell.setCellValue("��������");
						cell.setCellValue(new HSSFRichTextString("��������"));						
					}else {
						cell.setCellValue(i + 1);
					}
						
				} catch (Exception e) {
					System.out.println(i + "��ſͻ��𰸳���" + e.getMessage());
				}
			}
		}
		doWrite(file);
		close() ;
	}
	private int doCheck() {
		int count = 1 ;
		flag = true ;
		row = sheet.getRow(0) ;
		while (flag) {
			try {
				if (row.getCell(count) == null) {
					flag = false;
					break;
				}
			} catch (Exception e) {
				flag = false;
				break;
			}
			count++;
		}
		return count;
	}
	private void conn(File file) {
		try {
			fs = new FileInputStream(file);
			ps = new POIFSFileSystem(fs);// ��Excel��������
			workbook = new HSSFWorkbook(ps);//��ʼ���ĵ�����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void doWrite(File file) {
		try {
			fos = new FileOutputStream(file);//��ȡ�ļ������
			fos.flush();
			workbook.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private void close() {
		try {
			
			if (fos!=null) {
				fos.close() ;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
};
