package UI;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import Util.Statistics;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;

public class StatisticsBin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Logger logger = LogManager.getLogger(RecycleBin.class.getName());
	private JPanel contentPane;
	private JButton back;       //������ҳ
	private JButton button_1;   //�������ͳ��
	private JButton button_2;   //ũ����Ů�޷��ڳ��ж����ԭ��ͳ��
	private JButton button_3;   //��������ͳ��
	private JButton button_4;   //��������ͳ��
	private JButton button_5;   //������Ϣ��Դͳ��
	private JButton button_6;   //ý���������ͳ��
	private JButton button_7;   //��������ͳ��
	private JButton button_8;   //���ض�ͯ�������Ա�ͳ��
	private JButton button_9;   //���ž�������ͳ��
	private JButton button_10;  //���ض�ͯ���ܱ����Ա�ͳ��
	private JButton button_11;  //���ض�ͯ�����Ա�ͳ��
	private JButton button_12;  //�������������Ա�ͳ��
	
	private JPanel panel; 
	
	private Statistics statistics;
	private int[] type;
	private int[] theme;
	private int[] source;
	private int[] showing;
	private int[] reason;
	private int[] mainBody;
	private int[] helpType;
	private int[] sexualAssaultGender;
	private int[] violenceGender;
	private int[] crimeGender;
	private int[] positiveHealthGender;
	private Map<String,Integer> sum = new HashMap<String,Integer>();
	
	
	
	
	
	/**
	 * Create the frame.
	 */
	public StatisticsBin() {
		
		statistics = new Statistics();
		type = statistics.getType();
		theme = statistics.getTheme();
		source = statistics.getSource();
		showing = statistics.getShowing();
		reason = statistics.getReason();
		mainBody = statistics.getMainBody();
		helpType = statistics.getHelpType();
		sexualAssaultGender = statistics.getSexualAssaultGender();
		violenceGender = statistics.getViolenceGender();
		crimeGender = statistics.getCrimeGender();
		positiveHealthGender = statistics.getPositiveHealthGender();
		sum = statistics.getSum();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(300, 50, 1000, 700);
		setLocation((int)(Toolkit.getDefaultToolkit().getScreenSize().
                getWidth()-1000)/2,(int)(Toolkit.getDefaultToolkit().getScreenSize().
                        getHeight()-700)/2);
		setSize(1000, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("�����������������ͳ��ͼ");
		
		back = new JButton("\u8FD4\u56DE\u9996\u9875");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				logger.info("������ҳ");
				setVisible(false);
				LeftBehindChildren.mainFrame.setVisible(true);
			}
		});
		back.setBounds(25, 26, 93, 23);
		back.setBackground(Color.darkGray);
		back.setForeground(Color.white);
		contentPane.add(back);		
		
		panel = new JPanel();
		panel.setBounds(120, 210, 787, 452);
		panel.setBackground(Color.gray);
//		setTitle("�����������������ͳ��ͼ");
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		for (int i = 0;i < 10;i ++)
		{
			dataset.addValue(sum.get(2006+i+""), 2006+i+"", 2006+i+"");
		}
		
		BarChart barchart = new BarChart(dataset,"�����������������ͳ��ͼ");
		panel.add(barchart.getChartPanel());
		panel.validate();
		contentPane.add(panel);
		
		button_1 = new JButton("\u76F8\u5173\u65B0\u95FB\u6570\u91CF\u7EDF\u8BA1");
		button_1.setBackground(Color.lightGray);
		button_1.setForeground(Color.white);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel.removeAll();
				button_1.setBackground(Color.lightGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("�����������������ͳ��ͼ");
				logger.info("�����������������ͳ��");
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				for (int i = 0;i < 10;i ++)
				{
					dataset.addValue(sum.get(2006+i+""), 2006+i+"", 2006+i+"");
				}
				
				BarChart barchart = new BarChart(dataset,"�����������������ͳ��ͼ");
				panel.add(barchart.getChartPanel());
				panel.validate();
			}
		});
		button_1.setBounds(160, 26, 200, 23);
		contentPane.add(button_1);
		
		button_2 = new JButton("\u519C\u6C11\u5DE5\u5B50\u5973\u65E0\u6CD5\u57CE\u5E02\u8BFB\u4E66\u539F\u56E0\u7EDF\u8BA1");
		button_2.setBackground(Color.darkGray);
		button_2.setForeground(Color.white);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.lightGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("ũ����Ů�޷����ж���ͳ��");
				logger.info("ũ����Ů�޷����ж���ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("�ޱ��ػ������빫��ѧУ", reason[0]);
				data.setValue("˽��ѧУѧ�Ѹ�", reason[1]);
				data.setValue("Խ��Խ��С��˽��ѧУ��ȡ����ѧ�ʸ�", reason[2]);
				data.setValue("˽��ѧУ��ѧ����û����", reason[3]);
				data.setValue("����", reason[4]);
				PieChart piechart = new PieChart(data,"ũ����Ů�޷����ж���ԭ��ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_2.setBounds(390, 26, 230, 23);
		contentPane.add(button_2);
		
		button_3 = new JButton("\u65B0\u95FB\u7C7B\u578B\u7EDF\u8BA1");
		button_3.setBackground(Color.darkGray);
		button_3.setForeground(Color.white);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.lightGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("��������ͳ��");
				logger.info("��������ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��������", type[0]);
				data.setValue("�ظ���д", type[1]);
				data.setValue("����", type[2]);
				data.setValue("����", type[3]);
				PieChart piechart = new PieChart(data,"��������ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_3.setBounds(640, 26, 220, 23);
		contentPane.add(button_3);
		
		button_4 = new JButton("\u62A5\u9053\u4E3B\u9898\u7EDF\u8BA1");
		button_4.setBackground(Color.darkGray);
		button_4.setForeground(Color.white);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.lightGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("��������ͳ��");
				logger.info("��������ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("�����ذ�", theme[0]);
				data.setValue("���ù���", theme[1]);
				data.setValue("���ض�ͯŬ������", theme[2]);
				data.setValue("���鿴��", theme[3]);
				data.setValue("�򹤸�ĸ��������", theme[4]);
				data.setValue("���ض�ͯ����", theme[5]);
				data.setValue("���ض�ͯ�Ⱪ��", theme[6]);
				data.setValue("���ض�ͯ����", theme[7]);
				data.setValue("����", theme[8]);
				PieChart piechart = new PieChart(data,"��������ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_4.setBounds(160, 78, 200, 23);
		contentPane.add(button_4);
		
		button_5 = new JButton("\u65B0\u95FB\u62A5\u9053\u6D88\u606F\u6765\u6E90\u7EDF\u8BA1");
		button_5.setBackground(Color.darkGray);
		button_5.setForeground(Color.white);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.lightGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("���ű�����Դͳ��");
				logger.info("���ű�����Դͳ��");
				DefaultCategoryDataset dataset = new DefaultCategoryDataset();
				dataset.addValue(source[0],"����", "����");
				dataset.addValue(source[1],"����", "����");
				dataset.addValue(source[2],"��ҵ", "��ҵ");
				dataset.addValue(source[3],"��ҵ��λ", "��ҵ��λ");
				dataset.addValue(source[4],"��������", "��������");
				dataset.addValue(source[5],"ר��ѧ��", "ר��ѧ��");
				dataset.addValue(source[6],"����", "����");
				BarChart barchart = new BarChart(dataset,"���ű�����Ϣ��Դͳ��ͼ");
				panel.add(barchart.getChartPanel());
				panel.validate();
			}
		});
		button_5.setBounds(390, 78, 230, 23);
		contentPane.add(button_5);
		
		button_6 = new JButton("\u5A92\u4ECB\u5448\u73B0\u5F62\u8C61\u7EDF\u8BA1");
		button_6.setBackground(Color.darkGray);
		button_6.setForeground(Color.white);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.lightGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("ý���������ͳ��");
				logger.info("ý���������ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("�������ҵ�����", showing[0]);
				data.setValue("����Ҹ�������", showing[1]);
				data.setValue("��������������", showing[2]);
				data.setValue("�����ͯ������", showing[3]);
				data.setValue("����", showing[4]);
				PieChart piechart = new PieChart(data,"ý������ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_6.setBounds(640, 78, 220, 23);
		contentPane.add(button_6);
		
		button_7 = new JButton("��������ͳ��");
		button_7.setForeground(Color.white);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.lightGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("��������ͳ��");
				logger.info("��������ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��������", mainBody[0]);
				data.setValue("��ҵ", mainBody[1]);
				data.setValue("��ҵ��λ", mainBody[2]);
				data.setValue("��������", mainBody[3]);
				data.setValue("����", mainBody[4]);
				PieChart piechart = new PieChart(data,"��������ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_7.setBackground(Color.darkGray);
		button_7.setBounds(160, 123, 200, 23);
		contentPane.add(button_7);
		
		button_8 = new JButton("���ض�ͯ�������Ա�ͳ��");
		button_8.setForeground(Color.white);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.lightGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("���ض�ͯ�������Ա�ͳ��");
				logger.info("���ض�ͯ�������Ա�ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��", sexualAssaultGender[0]);
				data.setValue("Ů", sexualAssaultGender[1]);
				PieChart piechart = new PieChart(data,"���ض�ͯ�������Ա�ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_8.setBackground(Color.darkGray);
		button_8.setBounds(640, 129, 220, 23);
		contentPane.add(button_8);
		
		button_9 = new JButton("���ž�������ͳ��");
		button_9.setForeground(Color.white);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.lightGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("���ž�������ͳ��");
				logger.info("���ž�������ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("����һ�ξ�����", helpType[0]);
				data.setValue("���λ���ŵ���Ŀ֮һ", helpType[1]);
				data.setValue("��ѿ���", helpType[2]);
				data.setValue("��������������Ŀ", helpType[3]);
				data.setValue("����", helpType[4]);
				PieChart piechart = new PieChart(data,"���ž�������ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_9.setBackground(Color.darkGray);
		button_9.setBounds(390, 129, 230, 23);
		contentPane.add(button_9);
		
		button_10 = new JButton("���ض�ͯ���ܱ����Ա�ͳ��");
		button_10.setForeground(Color.white);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.lightGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.darkGray);
				setTitle("���ض�ͯ���ܱ����Ա�ͳ��");
				logger.info("���ض�ͯ���ܱ����Ա�ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��", violenceGender[0]);
				data.setValue("Ů", violenceGender[1]);
				PieChart piechart = new PieChart(data,"���ض�ͯ���ܱ����Ա�ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_10.setBackground(Color.darkGray);
		button_10.setBounds(160, 167, 200, 23);
		contentPane.add(button_10);
		
		button_11 = new JButton("���ض�ͯ�����Ա�ͳ��");
		button_11.setForeground(Color.white);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.lightGray);
				button_12.setBackground(Color.darkGray);
				setTitle("���ض�ͯ�����Ա�ͳ��");
				logger.info("���ض�ͯ�����Ա�ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��", crimeGender[0]);
				data.setValue("Ů", crimeGender[1]);
				PieChart piechart = new PieChart(data,"���ض�ͯ�����Ա�ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_11.setBackground(Color.darkGray);
		button_11.setBounds(390, 167, 230, 23);
		contentPane.add(button_11);
		
		button_12 = new JButton("�������������Ա�ͳ��");
		button_12.setForeground(Color.white);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.removeAll();
				button_1.setBackground(Color.darkGray);
				button_2.setBackground(Color.darkGray);
				button_3.setBackground(Color.darkGray);
				button_4.setBackground(Color.darkGray);
				button_5.setBackground(Color.darkGray);
				button_6.setBackground(Color.darkGray);
				button_7.setBackground(Color.darkGray);
				button_8.setBackground(Color.darkGray);
				button_9.setBackground(Color.darkGray);
				button_10.setBackground(Color.darkGray);
				button_11.setBackground(Color.darkGray);
				button_12.setBackground(Color.lightGray);
				setTitle("�������������Ա�ͳ��");
				logger.info("�������������Ա�ͳ��");
				DefaultPieDataset data = new DefaultPieDataset();
				data.setValue("��", positiveHealthGender[0]);
				data.setValue("Ů", positiveHealthGender[1]);
				PieChart piechart = new PieChart(data,"�������������Ա�ͳ��");
				panel.add(piechart.getPieChartPanel());
				panel.validate();
			}
		});
		button_12.setBackground(Color.darkGray);
		button_12.setBounds(640, 167, 220, 23);
		contentPane.add(button_12);
		
		
	}
}