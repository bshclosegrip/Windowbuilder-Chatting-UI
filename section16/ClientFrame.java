package section16;

import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class ClientFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField tfServerIP;
	private JLabel lblNewLabel_1;
	private JTextField tfPort;
	private JButton btnConnect;
	private JButton btnDisConnect;
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
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientFrame frame = new ClientFrame();
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
	public ClientFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTfServerIP());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getTfPort());
		contentPane.add(getBtnConnect());
		contentPane.add(getBtnDisConnect());
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getTfMsg());
		contentPane.add(getBtnSend());
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("IP");
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	public JTextField getTfServerIP() {
		if (tfServerIP == null) {
			tfServerIP = new JTextField();
			tfServerIP.setBounds(43, 7, 116, 21);
			tfServerIP.setColumns(10);
		}
		return tfServerIP;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("PORT");
			lblNewLabel_1.setBounds(171, 10, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getTfPort() {
		if (tfPort == null) {
			tfPort = new JTextField();
			tfPort.setBounds(240, 7, 85, 21);
			tfPort.setColumns(10);
		}
		return tfPort;
	}
	public JButton getBtnConnect() {
		if (btnConnect == null) {
			btnConnect = new JButton("\uC811\uC18D");
			btnConnect.setBounds(337, 6, 97, 23);
		}
		return btnConnect;
	}
	public JButton getBtnDisConnect() {
		if (btnDisConnect == null) {
			btnDisConnect = new JButton("\uD574\uC81C");
			btnDisConnect.setBounds(446, 6, 97, 23);
		}
		return btnDisConnect;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 49, 181, 289);
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
			scrollPane_1.setBounds(203, 48, 340, 289);
			scrollPane_1.setViewportView(getTextPane());
			scrollPane_1.setColumnHeaderView(getLblNewLabel_3());
		}
		return scrollPane_1;
	}
	public JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
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
			tfMsg.setBounds(12, 348, 422, 21);
			tfMsg.setColumns(10);
		}
		return tfMsg;
	}
	public JButton getBtnSend() {
		if (btnSend == null) {
			btnSend = new JButton("\uC804\uC1A1");
			btnSend.setBounds(446, 347, 97, 23);
		}
		return btnSend;
	}
}
