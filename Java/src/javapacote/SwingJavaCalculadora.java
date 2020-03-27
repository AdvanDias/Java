package javapacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;

public class SwingJavaCalculadora extends JFrame {

	private JPanel contentPane;
	public int vrecebe;
	public int vrecebe2 = 1;
	public String vOpera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingJavaCalculadora frame = new SwingJavaCalculadora();
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
	public SwingJavaCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 333);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblN10 = new JLabel("");
		lblN10.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN10.setBounds(223, 22, 23, 43);
		contentPane.add(lblN10);

		JLabel lblN9 = new JLabel("");
		lblN9.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN9.setBounds(200, 22, 23, 43);
		contentPane.add(lblN9);

		JLabel lblN8 = new JLabel("");
		lblN8.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN8.setBounds(176, 22, 23, 43);
		contentPane.add(lblN8);

		JLabel lblN7 = new JLabel("");
		lblN7.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN7.setBounds(154, 22, 23, 43);
		contentPane.add(lblN7);

		JLabel lblN6 = new JLabel("");
		lblN6.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN6.setBounds(130, 22, 23, 43);
		contentPane.add(lblN6);

		JLabel lblN5 = new JLabel("");
		lblN5.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN5.setBounds(106, 22, 23, 43);
		contentPane.add(lblN5);

		JLabel lblN4 = new JLabel("");
		lblN4.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN4.setBounds(85, 22, 23, 43);
		contentPane.add(lblN4);

		JLabel lblOpe = new JLabel("");
		lblOpe.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblOpe.setBounds(256, 24, 46, 30);
		contentPane.add(lblOpe);

		JLabel lblN2 = new JLabel("");
		lblN2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN2.setBounds(40, 22, 23, 43);
		contentPane.add(lblN2);

		JLabel lblN3 = new JLabel("");
		lblN3.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN3.setBounds(61, 22, 23, 43);
		contentPane.add(lblN3);

		JLabel lblN1 = new JLabel("");
		lblN1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblN1.setBounds(20, 22, 263, 43);
		contentPane.add(lblN1);

		JButton btnN1 = new JButton("1");
		btnN1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = "1";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN1.setBounds(10, 183, 79, 40);
		contentPane.add(btnN1);

		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 11, 345, 66);
		contentPane.add(textPane);

		JButton btnSoma = new JButton("+");
		btnSoma.setBackground(new Color(204, 204, 204));
		btnSoma.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "0";
				lblOpe.setText("+");
				String d = lblOpe.getText();
				Operacoes Ope = new Operacoes();
				if (lblN10.getText().equals("")) {
					int a10 = 0;
					if (lblN9.getText().equals("")) {
						int a9 = 0;
						if (lblN8.getText().equals("")) {
							int a8 = 0;
							if (lblN7.getText().equals("")) {
								int a7 = 0;
								if (lblN6.getText().equals("")) {
									int a6 = 0;
									if (lblN5.getText().equals("")) {
										int a5 = 0;
										if (lblN4.getText().equals("")) {
											int a4 = 0;
											if (lblN3.getText().equals("")) {
												int a3 = 0;
												if (lblN2.getText().equals("")) {
													int a2 = 0;
													if (lblN1.getText().equals("")) {
														int a1 = 0;

													} else {
														System.out.println(" + caso 1");
														int a1 = Integer.parseInt(lblN1.getText());
														vrecebe2 = 1;
														vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9,
																a10, vrecebe2, d);
														lblN1.setText("");
														lblN2.setText("");
														lblN3.setText("");
														lblN4.setText("");
														lblN5.setText("");
														lblN6.setText("");
														lblN7.setText("");
														lblN8.setText("");
														lblN9.setText("");
														lblN10.setText("");
														vOpera = d;
													}
												} else {
													System.out.println(" + caso 2");
													int a2 = Integer.parseInt(lblN2.getText());
													int a1 = Integer.parseInt(lblN1.getText());
													vrecebe2 = 10;
													vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
															vrecebe2, d);
													lblN1.setText("");
													lblN2.setText("");
													lblN3.setText("");
													lblN4.setText("");
													lblN5.setText("");
													lblN6.setText("");
													lblN7.setText("");
													lblN8.setText("");
													lblN9.setText("");
													lblN10.setText("");
													vOpera = d;
												}
											} else {
												System.out.println(" + caso 3");
												vrecebe2 = 100;
												int a3 = Integer.parseInt(lblN3.getText());
												int a2 = Integer.parseInt(lblN2.getText());
												int a1 = Integer.parseInt(lblN1.getText());
												vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
														vrecebe2, d);
												lblN1.setText("");
												lblN2.setText("");
												lblN3.setText("");
												lblN4.setText("");
												lblN5.setText("");
												lblN6.setText("");
												lblN7.setText("");
												lblN8.setText("");
												lblN9.setText("");
												lblN10.setText("");
												vOpera = d;
											}
										} else {
											System.out.println(" + caso 4");
											vrecebe2 = 1000;
											int a4 = Integer.parseInt(lblN4.getText());
											int a3 = Integer.parseInt(lblN3.getText());
											int a2 = Integer.parseInt(lblN2.getText());
											int a1 = Integer.parseInt(lblN1.getText());
											vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
													vrecebe2, d);
											lblN1.setText("");
											lblN2.setText("");
											lblN3.setText("");
											lblN4.setText("");
											lblN5.setText("");
											lblN6.setText("");
											lblN7.setText("");
											lblN8.setText("");
											lblN9.setText("");
											lblN10.setText("");
											vOpera = d;
										}
									} else {
										System.out.println(" + caso 5");
										vrecebe2 = 10000;
										int a5 = Integer.parseInt(lblN5.getText());
										int a4 = Integer.parseInt(lblN4.getText());
										int a3 = Integer.parseInt(lblN3.getText());
										int a2 = Integer.parseInt(lblN2.getText());
										int a1 = Integer.parseInt(lblN1.getText());
										vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2,
												d);
										lblN1.setText("");
										lblN2.setText("");
										lblN3.setText("");
										lblN4.setText("");
										lblN5.setText("");
										lblN6.setText("");
										lblN7.setText("");
										lblN8.setText("");
										lblN9.setText("");
										lblN10.setText("");
										vOpera = d;
									}
								} else {
									System.out.println(" + caso 6");
									vrecebe2 = 100000;
									int a6 = Integer.parseInt(lblN6.getText());
									int a5 = Integer.parseInt(lblN5.getText());
									int a4 = Integer.parseInt(lblN4.getText());
									int a3 = Integer.parseInt(lblN3.getText());
									int a2 = Integer.parseInt(lblN2.getText());
									int a1 = Integer.parseInt(lblN1.getText());
									vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
									lblN1.setText("");
									lblN2.setText("");
									lblN3.setText("");
									lblN4.setText("");
									lblN5.setText("");
									lblN6.setText("");
									lblN7.setText("");
									lblN8.setText("");
									lblN9.setText("");
									lblN10.setText("");
									vOpera = d;
								}
							} else {
								System.out.println(" + caso 7");
								vrecebe2 = 1000000;
								int a7 = Integer.parseInt(lblN7.getText());
								int a6 = Integer.parseInt(lblN6.getText());
								int a5 = Integer.parseInt(lblN5.getText());
								int a4 = Integer.parseInt(lblN4.getText());
								int a3 = Integer.parseInt(lblN3.getText());
								int a2 = Integer.parseInt(lblN2.getText());
								int a1 = Integer.parseInt(lblN1.getText());
								vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
								lblN1.setText("");
								lblN2.setText("");
								lblN3.setText("");
								lblN4.setText("");
								lblN5.setText("");
								lblN6.setText("");
								lblN7.setText("");
								lblN8.setText("");
								lblN9.setText("");
								lblN10.setText("");
								vOpera = d;
							}

						} else {
							System.out.println(" + caso 8");
							vrecebe2 = 10000000;
							int a8 = Integer.parseInt(lblN8.getText());
							int a7 = Integer.parseInt(lblN7.getText());
							int a6 = Integer.parseInt(lblN6.getText());
							int a5 = Integer.parseInt(lblN5.getText());
							int a4 = Integer.parseInt(lblN4.getText());
							int a3 = Integer.parseInt(lblN3.getText());
							int a2 = Integer.parseInt(lblN2.getText());
							int a1 = Integer.parseInt(lblN1.getText());
							vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
							lblN1.setText("");
							lblN2.setText("");
							lblN3.setText("");
							lblN4.setText("");
							lblN5.setText("");
							lblN6.setText("");
							lblN7.setText("");
							lblN8.setText("");
							lblN9.setText("");
							lblN10.setText("");
							vOpera = d;
						}

					} else {
						System.out.println(" + caso 9");
						vrecebe2 = 100000000;
						int a9 = Integer.parseInt(lblN9.getText());
						int a8 = Integer.parseInt(lblN8.getText());
						int a7 = Integer.parseInt(lblN7.getText());
						int a6 = Integer.parseInt(lblN6.getText());
						int a5 = Integer.parseInt(lblN5.getText());
						int a4 = Integer.parseInt(lblN4.getText());
						int a3 = Integer.parseInt(lblN3.getText());
						int a2 = Integer.parseInt(lblN2.getText());
						int a1 = Integer.parseInt(lblN1.getText());
						vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
						lblN1.setText("");
						lblN2.setText("");
						lblN3.setText("");
						lblN4.setText("");
						lblN5.setText("");
						lblN6.setText("");
						lblN7.setText("");
						lblN8.setText("");
						lblN9.setText("");
						lblN10.setText("");
						vOpera = d;
					}
				} else {
					System.out.println(" + caso 10");
					vrecebe2 = 1000000000;
					int a10 = Integer.parseInt(lblN10.getText());
					int a9 = Integer.parseInt(lblN9.getText());
					int a8 = Integer.parseInt(lblN8.getText());
					int a7 = Integer.parseInt(lblN7.getText());
					int a6 = Integer.parseInt(lblN6.getText());
					int a5 = Integer.parseInt(lblN5.getText());
					int a4 = Integer.parseInt(lblN4.getText());
					int a3 = Integer.parseInt(lblN3.getText());
					int a2 = Integer.parseInt(lblN2.getText());
					int a1 = Integer.parseInt(lblN1.getText());
					vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
					lblN1.setText("");
					lblN2.setText("");
					lblN3.setText("");
					lblN4.setText("");
					lblN5.setText("");
					lblN6.setText("");
					lblN7.setText("");
					lblN8.setText("");
					lblN9.setText("");
					lblN10.setText("");
					vOpera = d;
				}

			}
		});
		btnSoma.setBounds(276, 229, 79, 40);
		contentPane.add(btnSoma);

		JButton btnLimpa = new JButton("C");
		btnLimpa.setForeground(Color.WHITE);
		btnLimpa.setBackground(new Color(255, 51, 51));
		btnLimpa.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblN1.setText("");
				lblN2.setText("");
				lblN3.setText("");
				lblN4.setText("");
				lblN5.setText("");
				lblN6.setText("");
				lblN7.setText("");
				lblN8.setText("");
				lblN9.setText("");
				lblN10.setText("");
				lblOpe.setText("");
			}
		});
		btnLimpa.setBounds(10, 229, 79, 40);
		contentPane.add(btnLimpa);

		JButton btnResult = new JButton("=");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operacoes Ope = new Operacoes();
				lblOpe.setText("");
				String d = lblOpe.getText();

				if (lblN10.getText().equals("")) {
					int a10 = 0;
					if (lblN9.getText().equals("")) {
						int a9 = 0;
						if (lblN8.getText().equals("")) {
							int a8 = 0;
							if (lblN7.getText().equals("")) {
								int a7 = 0;
								if (lblN6.getText().equals("")) {
									int a6 = 0;
									if (lblN5.getText().equals("")) {
										int a5 = 0;
										if (lblN4.getText().equals("")) {
											int a4 = 0;
											if (lblN3.getText().equals("")) {
												int a3 = 0;
												if (lblN2.getText().equals("")) {
													int a2 = 0;
													if (lblN1.getText().equals("")) {
														int a1 = 0;
													} else {
														System.out.println(" = caso 1");
														int a1 = Integer.parseInt(lblN1.getText());
														vrecebe2 = 1;
														float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8,
																a9, a10, vrecebe2, d);
														if(vOpera.equals("+")) {
															float result = vrecebe + total;
															lblN1.setText(Integer.toString((int) result));
														}else if(vOpera.equals("-")) {
															float result = vrecebe - total;
															lblN1.setText(Integer.toString((int) result));
														}else if(vOpera.equals("/")) {
															float result = vrecebe / total;
															lblN1.setText(Integer.toString((int) result));
														}else if(vOpera.equals("*")) {
															float result = vrecebe * total;
															lblN1.setText(Integer.toString((int) result));
														}
														
														lblN2.setText("");
														lblN3.setText("");
														lblN4.setText("");
														lblN5.setText("");
														lblN6.setText("");
														lblN7.setText("");
														lblN8.setText("");
														lblN9.setText("");
														lblN10.setText("");
													}
												} else {
													System.out.println(" = caso 2");
													int a2 = Integer.parseInt(lblN2.getText());
													int a1 = Integer.parseInt(lblN1.getText());
													vrecebe2 = 10;
													float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9,
															a10, vrecebe2, d);
													if(vOpera.equals("+")) {
														float result = vrecebe + total;
														lblN1.setText(Integer.toString((int) result));
													}else if(vOpera.equals("-")) {
														float result = vrecebe - total;
														lblN1.setText(Integer.toString((int) result));
													}else if(vOpera.equals("/")) {
														float result = vrecebe / total;
														lblN1.setText(Integer.toString((int) result));
													}else if(vOpera.equals("*")) {
														float result = vrecebe * total;
														lblN1.setText(Integer.toString((int) result));
													}
													lblN2.setText("");
													lblN3.setText("");
													lblN4.setText("");
													lblN5.setText("");
													lblN6.setText("");
													lblN7.setText("");
													lblN8.setText("");
													lblN9.setText("");
													lblN10.setText("");
												}
											} else {
												System.out.println(" = caso 3");
												int a3 = Integer.parseInt(lblN3.getText());
												int a2 = Integer.parseInt(lblN2.getText());
												int a1 = Integer.parseInt(lblN1.getText());
												vrecebe2 = 100;
												float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
														vrecebe2, d);
												if(vOpera.equals("+")) {
													float result = vrecebe + total;
													lblN1.setText(Integer.toString((int) result));
												}else if(vOpera.equals("-")) {
													float result = vrecebe - total;
													lblN1.setText(Integer.toString((int) result));
												}else if(vOpera.equals("/")) {
													float result = vrecebe / total;
													lblN1.setText(Integer.toString((int) result));
												}else if(vOpera.equals("*")) {
													float result = vrecebe * total;
													lblN1.setText(Integer.toString((int) result));
												}
												lblN2.setText("");
												lblN3.setText("");
												lblN4.setText("");
												lblN5.setText("");
												lblN6.setText("");
												lblN7.setText("");
												lblN8.setText("");
												lblN9.setText("");
												lblN10.setText("");
											}
										} else {
											System.out.println(" = caso 4");
											int a4 = Integer.parseInt(lblN4.getText());
											int a3 = Integer.parseInt(lblN3.getText());
											int a2 = Integer.parseInt(lblN2.getText());
											int a1 = Integer.parseInt(lblN1.getText());
											vrecebe2 = 1000;
											float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
													vrecebe2, d);
											if(vOpera.equals("+")) {
												float result = vrecebe + total;
												lblN1.setText(Integer.toString((int) result));
											}else if(vOpera.equals("-")) {
												float result = vrecebe - total;
												lblN1.setText(Integer.toString((int) result));
											}else if(vOpera.equals("/")) {
												float result = vrecebe / total;
												lblN1.setText(Integer.toString((int) result));
											}else if(vOpera.equals("*")) {
												float result = vrecebe * total;
												lblN1.setText(Integer.toString((int) result));
											}
											lblN2.setText("");
											lblN3.setText("");
											lblN4.setText("");
											lblN5.setText("");
											lblN6.setText("");
											lblN7.setText("");
											lblN8.setText("");
											lblN9.setText("");
											lblN10.setText("");
										}
									} else {
										System.out.println(" = caso 5");
										int a5 = Integer.parseInt(lblN5.getText());
										int a4 = Integer.parseInt(lblN4.getText());
										int a3 = Integer.parseInt(lblN3.getText());
										int a2 = Integer.parseInt(lblN2.getText());
										int a1 = Integer.parseInt(lblN1.getText());
										vrecebe2 = 10000;
										float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
												vrecebe2, d);
										if(vOpera.equals("+")) {
											float result = vrecebe + total;
											lblN1.setText(Integer.toString((int) result));
										}else if(vOpera.equals("-")) {
											float result = vrecebe - total;
											lblN1.setText(Integer.toString((int) result));
										}else if(vOpera.equals("/")) {
											float result = vrecebe / total;
											lblN1.setText(Integer.toString((int) result));
										}else if(vOpera.equals("*")) {
											float result = vrecebe * total;
											lblN1.setText(Integer.toString((int) result));
										}
										lblN2.setText("");
										lblN3.setText("");
										lblN4.setText("");
										lblN5.setText("");
										lblN6.setText("");
										lblN7.setText("");
										lblN8.setText("");
										lblN9.setText("");
										lblN10.setText("");
									}
								} else {
									System.out.println(" = caso 6");
									int a6 = Integer.parseInt(lblN6.getText());
									int a5 = Integer.parseInt(lblN5.getText());
									int a4 = Integer.parseInt(lblN4.getText());
									int a3 = Integer.parseInt(lblN3.getText());
									int a2 = Integer.parseInt(lblN2.getText());
									int a1 = Integer.parseInt(lblN1.getText());
									vrecebe2 = 100000;
									float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2,
											d);
									if(vOpera.equals("+")) {
										float result = vrecebe + total;
										lblN1.setText(Integer.toString((int) result));
									}else if(vOpera.equals("-")) {
										float result = vrecebe - total;
										lblN1.setText(Integer.toString((int) result));
									}else if(vOpera.equals("/")) {
										float result = vrecebe / total;
										lblN1.setText(Integer.toString((int) result));
									}else if(vOpera.equals("*")) {
										float result = vrecebe * total;
										lblN1.setText(Integer.toString((int) result));
									}
									lblN2.setText("");
									lblN3.setText("");
									lblN4.setText("");
									lblN5.setText("");
									lblN6.setText("");
									lblN7.setText("");
									lblN8.setText("");
									lblN9.setText("");
									lblN10.setText("");
								}
							} else {
								System.out.println(" = caso 7");
								int a7 = Integer.parseInt(lblN7.getText());
								int a6 = Integer.parseInt(lblN6.getText());
								int a5 = Integer.parseInt(lblN5.getText());
								int a4 = Integer.parseInt(lblN4.getText());
								int a3 = Integer.parseInt(lblN3.getText());
								int a2 = Integer.parseInt(lblN2.getText());
								int a1 = Integer.parseInt(lblN1.getText());
								vrecebe2 = 1000000;
								float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
								if(vOpera.equals("+")) {
									float result = vrecebe + total;
									lblN1.setText(Integer.toString((int) result));
								}else if(vOpera.equals("-")) {
									float result = vrecebe - total;
									lblN1.setText(Integer.toString((int) result));
								}else if(vOpera.equals("/")) {
									float result = vrecebe / total;
									lblN1.setText(Integer.toString((int) result));
								}else if(vOpera.equals("*")) {
									float result = vrecebe * total;
									lblN1.setText(Integer.toString((int) result));
								}
								lblN2.setText("");
								lblN3.setText("");
								lblN4.setText("");
								lblN5.setText("");
								lblN6.setText("");
								lblN7.setText("");
								lblN8.setText("");
								lblN9.setText("");
								lblN10.setText("");
							}

						} else {
							System.out.println(" = caso 8");
							int a8 = Integer.parseInt(lblN8.getText());
							int a7 = Integer.parseInt(lblN7.getText());
							int a6 = Integer.parseInt(lblN6.getText());
							int a5 = Integer.parseInt(lblN5.getText());
							int a4 = Integer.parseInt(lblN4.getText());
							int a3 = Integer.parseInt(lblN3.getText());
							int a2 = Integer.parseInt(lblN2.getText());
							int a1 = Integer.parseInt(lblN1.getText());
							vrecebe2 = 10000000;
							float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
							if(vOpera.equals("+")) {
								float result = vrecebe + total;
								lblN1.setText(Integer.toString((int) result));
							}else if(vOpera.equals("-")) {
								float result = vrecebe - total;
								lblN1.setText(Integer.toString((int) result));
							}else if(vOpera.equals("/")) {
								float result = vrecebe / total;
								lblN1.setText(Integer.toString((int) result));
							}else if(vOpera.equals("*")) {
								float result = vrecebe * total;
								lblN1.setText(Integer.toString((int) result));
							}
							lblN2.setText("");
							lblN3.setText("");
							lblN4.setText("");
							lblN5.setText("");
							lblN6.setText("");
							lblN7.setText("");
							lblN8.setText("");
							lblN9.setText("");
							lblN10.setText("");
						}

					} else {
						System.out.println(" = caso 9");
						int a9 = Integer.parseInt(lblN9.getText());
						int a8 = Integer.parseInt(lblN8.getText());
						int a7 = Integer.parseInt(lblN7.getText());
						int a6 = Integer.parseInt(lblN6.getText());
						int a5 = Integer.parseInt(lblN5.getText());
						int a4 = Integer.parseInt(lblN4.getText());
						int a3 = Integer.parseInt(lblN3.getText());
						int a2 = Integer.parseInt(lblN2.getText());
						int a1 = Integer.parseInt(lblN1.getText());
						vrecebe2 = 100000000;
						float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
						if(vOpera.equals("+")) {
							float result = vrecebe + total;
							lblN1.setText(Integer.toString((int) result));
						}else if(vOpera.equals("-")) {
							float result = vrecebe - total;
							lblN1.setText(Integer.toString((int) result));
						}else if(vOpera.equals("/")) {
							float result = vrecebe / total;
							lblN1.setText(Integer.toString((int) result));
						}else if(vOpera.equals("*")) {
							float result = vrecebe * total;
							lblN1.setText(Integer.toString((int) result));
						}
						lblN2.setText("");
						lblN3.setText("");
						lblN4.setText("");
						lblN5.setText("");
						lblN6.setText("");
						lblN7.setText("");
						lblN8.setText("");
						lblN9.setText("");
						lblN10.setText("");
					}
				} else {
					System.out.println(" = caso 10");
					int a10 = Integer.parseInt(lblN10.getText());
					int a9 = Integer.parseInt(lblN9.getText());
					int a8 = Integer.parseInt(lblN8.getText());
					int a7 = Integer.parseInt(lblN7.getText());
					int a6 = Integer.parseInt(lblN6.getText());
					int a5 = Integer.parseInt(lblN5.getText());
					int a4 = Integer.parseInt(lblN4.getText());
					int a3 = Integer.parseInt(lblN3.getText());
					int a2 = Integer.parseInt(lblN2.getText());
					int a1 = Integer.parseInt(lblN1.getText());
					vrecebe2 = 1000000000;
					float total = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
					if(vOpera.equals("+")) {
						float result = vrecebe + total;
						lblN1.setText(Integer.toString((int) result));
					}else if(vOpera.equals("-")) {
						float result = vrecebe - total;
						lblN1.setText(Integer.toString((int) result));
					}else if(vOpera.equals("/")) {
						float result = vrecebe / total;
						lblN1.setText(Integer.toString((int) result));
					}else if(vOpera.equals("*")) {
						float result = vrecebe * total;
						lblN1.setText(Integer.toString((int) result));
					}
					lblN2.setText("");
					lblN3.setText("");
					lblN4.setText("");
					lblN5.setText("");
					lblN6.setText("");
					lblN7.setText("");
					lblN8.setText("");
					lblN9.setText("");
					lblN10.setText("");
				}

			}
		});
		btnResult.setBounds(187, 229, 79, 40);
		contentPane.add(btnResult);

		JButton btnN7 = new JButton("7");
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "7";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN7.setBounds(10, 88, 79, 40);
		contentPane.add(btnN7);

		JButton btnN8 = new JButton("8");
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "8";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN8.setBounds(98, 88, 79, 40);
		contentPane.add(btnN8);

		JButton btnN9 = new JButton("9");
		btnN9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "9";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN9.setBounds(187, 88, 79, 40);
		contentPane.add(btnN9);

		JButton btnMult = new JButton("*");
		btnMult.setBackground(new Color(204, 204, 204));
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "0";
				lblOpe.setText("*");
				String d = lblOpe.getText();
				Operacoes Ope = new Operacoes();
				if (lblN10.getText().equals("")) {
					int a10 = 0;
					if (lblN9.getText().equals("")) {
						int a9 = 0;
						if (lblN8.getText().equals("")) {
							int a8 = 0;
							if (lblN7.getText().equals("")) {
								int a7 = 0;
								if (lblN6.getText().equals("")) {
									int a6 = 0;
									if (lblN5.getText().equals("")) {
										int a5 = 0;
										if (lblN4.getText().equals("")) {
											int a4 = 0;
											if (lblN3.getText().equals("")) {
												int a3 = 0;
												if (lblN2.getText().equals("")) {
													int a2 = 0;
													if (lblN1.getText().equals("")) {
														int a1 = 0;

													} else {
														System.out.println(" * caso 1");
														int a1 = Integer.parseInt(lblN1.getText());
														vrecebe2 = 1;
														vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9,
																a10, vrecebe2, d);
														lblN1.setText("");
														lblN2.setText("");
														lblN3.setText("");
														lblN4.setText("");
														lblN5.setText("");
														lblN6.setText("");
														lblN7.setText("");
														lblN8.setText("");
														lblN9.setText("");
														lblN10.setText("");
														vOpera = d;
													}
												} else {
													System.out.println(" * caso 2");
													int a2 = Integer.parseInt(lblN2.getText());
													int a1 = Integer.parseInt(lblN1.getText());
													vrecebe2 = 10;
													vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
															vrecebe2, d);
													lblN1.setText("");
													lblN2.setText("");
													lblN3.setText("");
													lblN4.setText("");
													lblN5.setText("");
													lblN6.setText("");
													lblN7.setText("");
													lblN8.setText("");
													lblN9.setText("");
													lblN10.setText("");
													vOpera = d;
												}
											} else {
												System.out.println(" * caso 3");
												vrecebe2 = 100;
												int a3 = Integer.parseInt(lblN3.getText());
												int a2 = Integer.parseInt(lblN2.getText());
												int a1 = Integer.parseInt(lblN1.getText());
												vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
														vrecebe2, d);
												lblN1.setText("");
												lblN2.setText("");
												lblN3.setText("");
												lblN4.setText("");
												lblN5.setText("");
												lblN6.setText("");
												lblN7.setText("");
												lblN8.setText("");
												lblN9.setText("");
												lblN10.setText("");
												vOpera = d;
											}
										} else {
											System.out.println(" * caso 4");
											vrecebe2 = 1000;
											int a4 = Integer.parseInt(lblN4.getText());
											int a3 = Integer.parseInt(lblN3.getText());
											int a2 = Integer.parseInt(lblN2.getText());
											int a1 = Integer.parseInt(lblN1.getText());
											vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
													vrecebe2, d);
											lblN1.setText("");
											lblN2.setText("");
											lblN3.setText("");
											lblN4.setText("");
											lblN5.setText("");
											lblN6.setText("");
											lblN7.setText("");
											lblN8.setText("");
											lblN9.setText("");
											lblN10.setText("");
											vOpera = d;
										}
									} else {
										System.out.println(" * caso 5");
										vrecebe2 = 10000;
										int a5 = Integer.parseInt(lblN5.getText());
										int a4 = Integer.parseInt(lblN4.getText());
										int a3 = Integer.parseInt(lblN3.getText());
										int a2 = Integer.parseInt(lblN2.getText());
										int a1 = Integer.parseInt(lblN1.getText());
										vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2,
												d);
										lblN1.setText("");
										lblN2.setText("");
										lblN3.setText("");
										lblN4.setText("");
										lblN5.setText("");
										lblN6.setText("");
										lblN7.setText("");
										lblN8.setText("");
										lblN9.setText("");
										lblN10.setText("");
										vOpera = d;
									}
								} else {
									System.out.println(" * caso 6");
									vrecebe2 = 100000;
									int a6 = Integer.parseInt(lblN6.getText());
									int a5 = Integer.parseInt(lblN5.getText());
									int a4 = Integer.parseInt(lblN4.getText());
									int a3 = Integer.parseInt(lblN3.getText());
									int a2 = Integer.parseInt(lblN2.getText());
									int a1 = Integer.parseInt(lblN1.getText());
									vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
									lblN1.setText("");
									lblN2.setText("");
									lblN3.setText("");
									lblN4.setText("");
									lblN5.setText("");
									lblN6.setText("");
									lblN7.setText("");
									lblN8.setText("");
									lblN9.setText("");
									lblN10.setText("");
									vOpera = d;
								}
							} else {
								System.out.println(" * caso 7");
								vrecebe2 = 1000000;
								int a7 = Integer.parseInt(lblN7.getText());
								int a6 = Integer.parseInt(lblN6.getText());
								int a5 = Integer.parseInt(lblN5.getText());
								int a4 = Integer.parseInt(lblN4.getText());
								int a3 = Integer.parseInt(lblN3.getText());
								int a2 = Integer.parseInt(lblN2.getText());
								int a1 = Integer.parseInt(lblN1.getText());
								vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
								lblN1.setText("");
								lblN2.setText("");
								lblN3.setText("");
								lblN4.setText("");
								lblN5.setText("");
								lblN6.setText("");
								lblN7.setText("");
								lblN8.setText("");
								lblN9.setText("");
								lblN10.setText("");
								vOpera = d;
							}

						} else {
							System.out.println(" * caso 8");
							vrecebe2 = 10000000;
							int a8 = Integer.parseInt(lblN8.getText());
							int a7 = Integer.parseInt(lblN7.getText());
							int a6 = Integer.parseInt(lblN6.getText());
							int a5 = Integer.parseInt(lblN5.getText());
							int a4 = Integer.parseInt(lblN4.getText());
							int a3 = Integer.parseInt(lblN3.getText());
							int a2 = Integer.parseInt(lblN2.getText());
							int a1 = Integer.parseInt(lblN1.getText());
							vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
							lblN1.setText("");
							lblN2.setText("");
							lblN3.setText("");
							lblN4.setText("");
							lblN5.setText("");
							lblN6.setText("");
							lblN7.setText("");
							lblN8.setText("");
							lblN9.setText("");
							lblN10.setText("");
							vOpera = d;
						}

					} else {
						System.out.println(" * caso 9");
						vrecebe2 = 100000000;
						int a9 = Integer.parseInt(lblN9.getText());
						int a8 = Integer.parseInt(lblN8.getText());
						int a7 = Integer.parseInt(lblN7.getText());
						int a6 = Integer.parseInt(lblN6.getText());
						int a5 = Integer.parseInt(lblN5.getText());
						int a4 = Integer.parseInt(lblN4.getText());
						int a3 = Integer.parseInt(lblN3.getText());
						int a2 = Integer.parseInt(lblN2.getText());
						int a1 = Integer.parseInt(lblN1.getText());
						vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
						lblN1.setText("");
						lblN2.setText("");
						lblN3.setText("");
						lblN4.setText("");
						lblN5.setText("");
						lblN6.setText("");
						lblN7.setText("");
						lblN8.setText("");
						lblN9.setText("");
						lblN10.setText("");
						vOpera = d;
					}
				} else {
					System.out.println(" * caso 10");
					vrecebe2 = 1000000000;
					int a10 = Integer.parseInt(lblN10.getText());
					int a9 = Integer.parseInt(lblN9.getText());
					int a8 = Integer.parseInt(lblN8.getText());
					int a7 = Integer.parseInt(lblN7.getText());
					int a6 = Integer.parseInt(lblN6.getText());
					int a5 = Integer.parseInt(lblN5.getText());
					int a4 = Integer.parseInt(lblN4.getText());
					int a3 = Integer.parseInt(lblN3.getText());
					int a2 = Integer.parseInt(lblN2.getText());
					int a1 = Integer.parseInt(lblN1.getText());
					vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
					lblN1.setText("");
					lblN2.setText("");
					lblN3.setText("");
					lblN4.setText("");
					lblN5.setText("");
					lblN6.setText("");
					lblN7.setText("");
					lblN8.setText("");
					lblN9.setText("");
					lblN10.setText("");
					vOpera = d;
				}

			}
		});
		btnMult.setBounds(276, 88, 79, 40);
		contentPane.add(btnMult);

		JButton btnDiv = new JButton("/");
		btnDiv.setBackground(new Color(204, 204, 204));
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "0";
				lblOpe.setText("/");
				String d = lblOpe.getText();
				Operacoes Ope = new Operacoes();
				if (lblN10.getText().equals("")) {
					int a10 = 0;
					if (lblN9.getText().equals("")) {
						int a9 = 0;
						if (lblN8.getText().equals("")) {
							int a8 = 0;
							if (lblN7.getText().equals("")) {
								int a7 = 0;
								if (lblN6.getText().equals("")) {
									int a6 = 0;
									if (lblN5.getText().equals("")) {
										int a5 = 0;
										if (lblN4.getText().equals("")) {
											int a4 = 0;
											if (lblN3.getText().equals("")) {
												int a3 = 0;
												if (lblN2.getText().equals("")) {
													int a2 = 0;
													if (lblN1.getText().equals("")) {
														int a1 = 0;

													} else {
														System.out.println(" / caso 1");
														int a1 = Integer.parseInt(lblN1.getText());
														vrecebe2 = 1;
														vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9,
																a10, vrecebe2, d);
														lblN1.setText("");
														lblN2.setText("");
														lblN3.setText("");
														lblN4.setText("");
														lblN5.setText("");
														lblN6.setText("");
														lblN7.setText("");
														lblN8.setText("");
														lblN9.setText("");
														lblN10.setText("");
														vOpera = d;
													}
												} else {
													System.out.println(" / caso 2");
													int a2 = Integer.parseInt(lblN2.getText());
													int a1 = Integer.parseInt(lblN1.getText());
													vrecebe2 = 10;
													vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
															vrecebe2, d);
													lblN1.setText("");
													lblN2.setText("");
													lblN3.setText("");
													lblN4.setText("");
													lblN5.setText("");
													lblN6.setText("");
													lblN7.setText("");
													lblN8.setText("");
													lblN9.setText("");
													lblN10.setText("");
													vOpera = d;
												}
											} else {
												System.out.println(" / caso 3");
												vrecebe2 = 100;
												int a3 = Integer.parseInt(lblN3.getText());
												int a2 = Integer.parseInt(lblN2.getText());
												int a1 = Integer.parseInt(lblN1.getText());
												vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
														vrecebe2, d);
												lblN1.setText("");
												lblN2.setText("");
												lblN3.setText("");
												lblN4.setText("");
												lblN5.setText("");
												lblN6.setText("");
												lblN7.setText("");
												lblN8.setText("");
												lblN9.setText("");
												lblN10.setText("");
												vOpera = d;
											}
										} else {
											System.out.println(" / caso 4");
											vrecebe2 = 1000;
											int a4 = Integer.parseInt(lblN4.getText());
											int a3 = Integer.parseInt(lblN3.getText());
											int a2 = Integer.parseInt(lblN2.getText());
											int a1 = Integer.parseInt(lblN1.getText());
											vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
													vrecebe2, d);
											lblN1.setText("");
											lblN2.setText("");
											lblN3.setText("");
											lblN4.setText("");
											lblN5.setText("");
											lblN6.setText("");
											lblN7.setText("");
											lblN8.setText("");
											lblN9.setText("");
											lblN10.setText("");
											vOpera = d;
										}
									} else {
										System.out.println(" / caso 5");
										vrecebe2 = 10000;
										int a5 = Integer.parseInt(lblN5.getText());
										int a4 = Integer.parseInt(lblN4.getText());
										int a3 = Integer.parseInt(lblN3.getText());
										int a2 = Integer.parseInt(lblN2.getText());
										int a1 = Integer.parseInt(lblN1.getText());
										vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2,
												d);
										lblN1.setText("");
										lblN2.setText("");
										lblN3.setText("");
										lblN4.setText("");
										lblN5.setText("");
										lblN6.setText("");
										lblN7.setText("");
										lblN8.setText("");
										lblN9.setText("");
										lblN10.setText("");
										vOpera = d;
									}
								} else {
									System.out.println(" / caso 6");
									vrecebe2 = 100000;
									int a6 = Integer.parseInt(lblN6.getText());
									int a5 = Integer.parseInt(lblN5.getText());
									int a4 = Integer.parseInt(lblN4.getText());
									int a3 = Integer.parseInt(lblN3.getText());
									int a2 = Integer.parseInt(lblN2.getText());
									int a1 = Integer.parseInt(lblN1.getText());
									vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
									lblN1.setText("");
									lblN2.setText("");
									lblN3.setText("");
									lblN4.setText("");
									lblN5.setText("");
									lblN6.setText("");
									lblN7.setText("");
									lblN8.setText("");
									lblN9.setText("");
									lblN10.setText("");
									vOpera = d;
								}
							} else {
								System.out.println(" / caso 7");
								vrecebe2 = 1000000;
								int a7 = Integer.parseInt(lblN7.getText());
								int a6 = Integer.parseInt(lblN6.getText());
								int a5 = Integer.parseInt(lblN5.getText());
								int a4 = Integer.parseInt(lblN4.getText());
								int a3 = Integer.parseInt(lblN3.getText());
								int a2 = Integer.parseInt(lblN2.getText());
								int a1 = Integer.parseInt(lblN1.getText());
								vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
								lblN1.setText("");
								lblN2.setText("");
								lblN3.setText("");
								lblN4.setText("");
								lblN5.setText("");
								lblN6.setText("");
								lblN7.setText("");
								lblN8.setText("");
								lblN9.setText("");
								lblN10.setText("");
								vOpera = d;
							}

						} else {
							System.out.println(" / caso 8");
							vrecebe2 = 10000000;
							int a8 = Integer.parseInt(lblN8.getText());
							int a7 = Integer.parseInt(lblN7.getText());
							int a6 = Integer.parseInt(lblN6.getText());
							int a5 = Integer.parseInt(lblN5.getText());
							int a4 = Integer.parseInt(lblN4.getText());
							int a3 = Integer.parseInt(lblN3.getText());
							int a2 = Integer.parseInt(lblN2.getText());
							int a1 = Integer.parseInt(lblN1.getText());
							vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
							lblN1.setText("");
							lblN2.setText("");
							lblN3.setText("");
							lblN4.setText("");
							lblN5.setText("");
							lblN6.setText("");
							lblN7.setText("");
							lblN8.setText("");
							lblN9.setText("");
							lblN10.setText("");
							vOpera = d;
						}

					} else {
						System.out.println(" / caso 9");
						vrecebe2 = 100000000;
						int a9 = Integer.parseInt(lblN9.getText());
						int a8 = Integer.parseInt(lblN8.getText());
						int a7 = Integer.parseInt(lblN7.getText());
						int a6 = Integer.parseInt(lblN6.getText());
						int a5 = Integer.parseInt(lblN5.getText());
						int a4 = Integer.parseInt(lblN4.getText());
						int a3 = Integer.parseInt(lblN3.getText());
						int a2 = Integer.parseInt(lblN2.getText());
						int a1 = Integer.parseInt(lblN1.getText());
						vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
						lblN1.setText("");
						lblN2.setText("");
						lblN3.setText("");
						lblN4.setText("");
						lblN5.setText("");
						lblN6.setText("");
						lblN7.setText("");
						lblN8.setText("");
						lblN9.setText("");
						lblN10.setText("");
						vOpera = d;
					}
				} else {
					System.out.println(" / caso 10");
					vrecebe2 = 1000000000;
					int a10 = Integer.parseInt(lblN10.getText());
					int a9 = Integer.parseInt(lblN9.getText());
					int a8 = Integer.parseInt(lblN8.getText());
					int a7 = Integer.parseInt(lblN7.getText());
					int a6 = Integer.parseInt(lblN6.getText());
					int a5 = Integer.parseInt(lblN5.getText());
					int a4 = Integer.parseInt(lblN4.getText());
					int a3 = Integer.parseInt(lblN3.getText());
					int a2 = Integer.parseInt(lblN2.getText());
					int a1 = Integer.parseInt(lblN1.getText());
					vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
					lblN1.setText("");
					lblN2.setText("");
					lblN3.setText("");
					lblN4.setText("");
					lblN5.setText("");
					lblN6.setText("");
					lblN7.setText("");
					lblN8.setText("");
					lblN9.setText("");
					lblN10.setText("");
					vOpera = d;
				}

			}
		});
		btnDiv.setBounds(276, 135, 79, 40);
		contentPane.add(btnDiv);

		JButton btnSub = new JButton("-");
		btnSub.setBackground(new Color(204, 204, 204));
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "0";
				lblOpe.setText("-");
				String d = lblOpe.getText();
				Operacoes Ope = new Operacoes();
				if (lblN10.getText().equals("")) {
					int a10 = 0;
					if (lblN9.getText().equals("")) {
						int a9 = 0;
						if (lblN8.getText().equals("")) {
							int a8 = 0;
							if (lblN7.getText().equals("")) {
								int a7 = 0;
								if (lblN6.getText().equals("")) {
									int a6 = 0;
									if (lblN5.getText().equals("")) {
										int a5 = 0;
										if (lblN4.getText().equals("")) {
											int a4 = 0;
											if (lblN3.getText().equals("")) {
												int a3 = 0;
												if (lblN2.getText().equals("")) {
													int a2 = 0;
													if (lblN1.getText().equals("")) {
														int a1 = 0;

													} else {
														System.out.println(" - caso 1");
														int a1 = Integer.parseInt(lblN1.getText());
														vrecebe2 = 1;
														vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9,
																a10, vrecebe2, d);
														lblN1.setText("");
														lblN2.setText("");
														lblN3.setText("");
														lblN4.setText("");
														lblN5.setText("");
														lblN6.setText("");
														lblN7.setText("");
														lblN8.setText("");
														lblN9.setText("");
														lblN10.setText("");
														vOpera = d;
													}
												} else {
													System.out.println(" - caso 2");
													int a2 = Integer.parseInt(lblN2.getText());
													int a1 = Integer.parseInt(lblN1.getText());
													vrecebe2 = 10;
													vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
															vrecebe2, d);
													lblN1.setText("");
													lblN2.setText("");
													lblN3.setText("");
													lblN4.setText("");
													lblN5.setText("");
													lblN6.setText("");
													lblN7.setText("");
													lblN8.setText("");
													lblN9.setText("");
													lblN10.setText("");
													vOpera = d;
												}
											} else {
												System.out.println(" - caso 3");
												vrecebe2 = 100;
												int a3 = Integer.parseInt(lblN3.getText());
												int a2 = Integer.parseInt(lblN2.getText());
												int a1 = Integer.parseInt(lblN1.getText());
												vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
														vrecebe2, d);
												lblN1.setText("");
												lblN2.setText("");
												lblN3.setText("");
												lblN4.setText("");
												lblN5.setText("");
												lblN6.setText("");
												lblN7.setText("");
												lblN8.setText("");
												lblN9.setText("");
												lblN10.setText("");
												vOpera = d;
											}
										} else {
											System.out.println(" - caso 4");
											vrecebe2 = 1000;
											int a4 = Integer.parseInt(lblN4.getText());
											int a3 = Integer.parseInt(lblN3.getText());
											int a2 = Integer.parseInt(lblN2.getText());
											int a1 = Integer.parseInt(lblN1.getText());
											vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
													vrecebe2, d);
											lblN1.setText("");
											lblN2.setText("");
											lblN3.setText("");
											lblN4.setText("");
											lblN5.setText("");
											lblN6.setText("");
											lblN7.setText("");
											lblN8.setText("");
											lblN9.setText("");
											lblN10.setText("");
											vOpera = d;
										}
									} else {
										System.out.println(" - caso 5");
										vrecebe2 = 10000;
										int a5 = Integer.parseInt(lblN5.getText());
										int a4 = Integer.parseInt(lblN4.getText());
										int a3 = Integer.parseInt(lblN3.getText());
										int a2 = Integer.parseInt(lblN2.getText());
										int a1 = Integer.parseInt(lblN1.getText());
										vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2,
												d);
										lblN1.setText("");
										lblN2.setText("");
										lblN3.setText("");
										lblN4.setText("");
										lblN5.setText("");
										lblN6.setText("");
										lblN7.setText("");
										lblN8.setText("");
										lblN9.setText("");
										lblN10.setText("");
										vOpera = d;
									}
								} else {
									System.out.println(" - caso 6");
									vrecebe2 = 100000;
									int a6 = Integer.parseInt(lblN6.getText());
									int a5 = Integer.parseInt(lblN5.getText());
									int a4 = Integer.parseInt(lblN4.getText());
									int a3 = Integer.parseInt(lblN3.getText());
									int a2 = Integer.parseInt(lblN2.getText());
									int a1 = Integer.parseInt(lblN1.getText());
									vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
									lblN1.setText("");
									lblN2.setText("");
									lblN3.setText("");
									lblN4.setText("");
									lblN5.setText("");
									lblN6.setText("");
									lblN7.setText("");
									lblN8.setText("");
									lblN9.setText("");
									lblN10.setText("");
									vOpera = d;
								}
							} else {
								System.out.println(" - caso 7");
								vrecebe2 = 1000000;
								int a7 = Integer.parseInt(lblN7.getText());
								int a6 = Integer.parseInt(lblN6.getText());
								int a5 = Integer.parseInt(lblN5.getText());
								int a4 = Integer.parseInt(lblN4.getText());
								int a3 = Integer.parseInt(lblN3.getText());
								int a2 = Integer.parseInt(lblN2.getText());
								int a1 = Integer.parseInt(lblN1.getText());
								vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
								lblN1.setText("");
								lblN2.setText("");
								lblN3.setText("");
								lblN4.setText("");
								lblN5.setText("");
								lblN6.setText("");
								lblN7.setText("");
								lblN8.setText("");
								lblN9.setText("");
								lblN10.setText("");
								vOpera = d;
							}

						} else {
							System.out.println(" - caso 8");
							vrecebe2 = 10000000;
							int a8 = Integer.parseInt(lblN8.getText());
							int a7 = Integer.parseInt(lblN7.getText());
							int a6 = Integer.parseInt(lblN6.getText());
							int a5 = Integer.parseInt(lblN5.getText());
							int a4 = Integer.parseInt(lblN4.getText());
							int a3 = Integer.parseInt(lblN3.getText());
							int a2 = Integer.parseInt(lblN2.getText());
							int a1 = Integer.parseInt(lblN1.getText());
							vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
							lblN1.setText("");
							lblN2.setText("");
							lblN3.setText("");
							lblN4.setText("");
							lblN5.setText("");
							lblN6.setText("");
							lblN7.setText("");
							lblN8.setText("");
							lblN9.setText("");
							lblN10.setText("");
							vOpera = d;
						}

					} else {
						System.out.println(" - caso 9");
						vrecebe2 = 100000000;
						int a9 = Integer.parseInt(lblN9.getText());
						int a8 = Integer.parseInt(lblN8.getText());
						int a7 = Integer.parseInt(lblN7.getText());
						int a6 = Integer.parseInt(lblN6.getText());
						int a5 = Integer.parseInt(lblN5.getText());
						int a4 = Integer.parseInt(lblN4.getText());
						int a3 = Integer.parseInt(lblN3.getText());
						int a2 = Integer.parseInt(lblN2.getText());
						int a1 = Integer.parseInt(lblN1.getText());
						vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
						lblN1.setText("");
						lblN2.setText("");
						lblN3.setText("");
						lblN4.setText("");
						lblN5.setText("");
						lblN6.setText("");
						lblN7.setText("");
						lblN8.setText("");
						lblN9.setText("");
						lblN10.setText("");
						vOpera = d;
					}
				} else {
					System.out.println(" - caso 10");
					vrecebe2 = 1000000000;
					int a10 = Integer.parseInt(lblN10.getText());
					int a9 = Integer.parseInt(lblN9.getText());
					int a8 = Integer.parseInt(lblN8.getText());
					int a7 = Integer.parseInt(lblN7.getText());
					int a6 = Integer.parseInt(lblN6.getText());
					int a5 = Integer.parseInt(lblN5.getText());
					int a4 = Integer.parseInt(lblN4.getText());
					int a3 = Integer.parseInt(lblN3.getText());
					int a2 = Integer.parseInt(lblN2.getText());
					int a1 = Integer.parseInt(lblN1.getText());
					vrecebe = Ope.Ope(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, vrecebe2, d);
					lblN1.setText("");
					lblN2.setText("");
					lblN3.setText("");
					lblN4.setText("");
					lblN5.setText("");
					lblN6.setText("");
					lblN7.setText("");
					lblN8.setText("");
					lblN9.setText("");
					lblN10.setText("");
					vOpera = d;
				}
			}
		});
		btnSub.setBounds(276, 183, 79, 40);
		contentPane.add(btnSub);

		JButton btnN6 = new JButton("6");
		btnN6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "6";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN6.setBounds(187, 135, 79, 40);
		contentPane.add(btnN6);

		JButton btnN5 = new JButton("5");
		btnN5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "5";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN5.setBounds(98, 135, 79, 40);
		contentPane.add(btnN5);

		JButton btnN4 = new JButton("4");
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "4";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}
			}
		});
		btnN4.setBounds(10, 135, 79, 40);
		contentPane.add(btnN4);

		JButton btnN3 = new JButton("3");
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "3";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN3.setBounds(187, 183, 79, 40);
		contentPane.add(btnN3);

		JButton btnN2 = new JButton("2");
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String x = "2";
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);

				} else {
					String guardar = lblN1.getText();
					if (guardar.equals("0")) {
						lblN1.setText(x);// subtitui o zero

					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);

						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN2.setBounds(99, 183, 79, 40);
		contentPane.add(btnN2);

		JButton btnN0 = new JButton("0");
		btnN0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String x = "0";
				
				if (lblN1.getText().equals("")) {
					lblN1.setText(x);
				} else {
					String guardar2 = lblN1.getText();
					if (guardar2.equals("0")) {
						// não faz nada
					} else {
						if (lblN2.getText().equals("")) {
							lblN2.setText(x);
							
						} else if (lblN3.getText().equals("")) {
							lblN3.setText(x);

						} else if (lblN4.getText().equals("")) {
							lblN4.setText(x);

						} else if (lblN5.getText().equals("")) {
							lblN5.setText(x);

						} else if (lblN6.getText().equals("")) {
							lblN6.setText(x);

						} else if (lblN7.getText().equals("")) {
							lblN7.setText(x);

						} else if (lblN8.getText().equals("")) {
							lblN8.setText(x);

						} else if (lblN9.getText().equals("")) {
							lblN9.setText(x);

						} else if (lblN10.getText().equals("")) {
							lblN10.setText(x);

						}
					}

				}

			}
		});
		btnN0.setBounds(98, 229, 79, 40);
		contentPane.add(btnN0);
	}
}
