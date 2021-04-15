package section16;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ServerFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfServerIP;
	private JLabel lblNewLabel_1;
	private JTextField tfPort;
	private JButton btnStart;
	private JButton btnStop;
	private JScrollPane scrollPane;
	private JList list;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane_1;
	private JTextPane textPane;
	private JLabel lblNewLabel_3;
	private JTextField tfMsg;
	private JButton btnSend;

	/**
	 * Launch the application.
	 */
	
	ServerController sc;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerFrame frame = new ServerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ServerFrame() {
		setTitle("\uCC44\uD305\uC11C\uBC84");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfServerIP());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfPort());
		contentPane.add(getBtnStart());
		contentPane.add(getBtnStop());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getTfMsg());
		contentPane.add(getBtnSend());
		
		try {
			InetAddress ia = InetAddress.getLocalHost();
			tfServerIP.setText(ia.getHostAddress());
		}catch(Exception ex) {
			ex.printStackTrace();
			textPane.setText("<font color='red'>IP주소를 가져오는데 오류가 발생함</font>");
		}
		
		
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Server IP");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	public JTextField getTfServerIP() {
		if (tfServerIP == null) {
			tfServerIP = new JTextField();
			tfServerIP.setBounds(85, 7, 116, 21);
			tfServerIP.setColumns(10);
		}
		return tfServerIP;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("PORT");
			lblNewLabel_1.setBounds(213, 10, 46, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getTfPort() {
		if (tfPort == null) {
			tfPort = new JTextField();
			tfPort.setText("9292");
			tfPort.setBounds(256, 7, 68, 21);
			tfPort.setColumns(10);
		}
		return tfPort;
	}
	public JButton getBtnStart() {
		if (btnStart == null) {
			btnStart = new JButton("\uC11C\uBC84\uC2DC\uC791");
			btnStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					sc = new ServerController(ServerFrame.this);
					Thread t = new Thread(sc);
					t.start();// 스레드를 시작
				}
			});
			btnStart.setBounds(336, 6, 97, 23);
		}
		return btnStart;
	}
	public JButton getBtnStop() {
		if (btnStop == null) {
			btnStop = new JButton("\uC11C\uBC84\uC885\uB8CC");
			btnStop.setBounds(445, 6, 97, 23);
		}
		return btnStop;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 40, 116, 218);
			scrollPane.setViewportView(getList());
			scrollPane.setColumnHeaderView(getLblNewLabel_2());
		}
		return scrollPane;
	}
	public JList getList() {
		if (list == null) {
			list = new JList();
		}
		return list;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC811\uC18D\uC790");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_2;
	}
	public JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(133, 38, 409, 218);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_3());
		}
		return scrollPane_1;
	}
	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setContentType("text/html");
		}
		return textPane;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uBA54\uC2DC\uC9C0");
		}
		return lblNewLabel_3;
	}
	public JTextField getTfMsg() {
		if (tfMsg == null) {
			tfMsg = new JTextField();
			tfMsg.setBounds(12, 268, 425, 21);
			tfMsg.setColumns(10);
		}
		return tfMsg;
	}
	public JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton("\uC804\uC1A1");
			btnSend.setBounds(445, 267, 97, 23);
		}
		return btnSend;
	}
}
