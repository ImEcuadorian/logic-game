/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package io.github.imecuadorian.logicgame.views;

import io.github.imecuadorian.logicgame.controller.DeductiveQuestionController;
import io.github.imecuadorian.logicgame.controller.InductiveQuestionController;
import io.github.imecuadorian.logicgame.helpers.ShuffleQuestion;
import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.InductiveQuestion;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import io.github.imecuadorian.logicgame.services.InductiveQuestionService;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * @author Hugo Saldarriaga
 */
public class QuestionInductiveView
	extends javax.swing.JDialog {

	/**
	 * Creates new form QuestionView
	 */

	private final InductiveQuestionController inductiveQuestionController;
	private final List<InductiveQuestion> questions;
	private final int maxQuestions;

	public QuestionInductiveView(
		java.awt.Frame parent,
		boolean modal,
		InductiveQuestionService inductiveQuestionService
	) {
		super(parent, modal);
		initComponents();
		this.inductiveQuestionController =
			new InductiveQuestionController(inductiveQuestionService);
		this.questions = (List<InductiveQuestion>) ShuffleQuestion.shuffleQuestions(
			inductiveQuestionController.getAll());
		this.maxQuestions = inductiveQuestionController.getSize();
		loadQuestion();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new BackGroundInductivePanel();
        jPanel2 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        Icons2 = new javax.swing.JLabel();
        icons3 = new javax.swing.JLabel();
        firstOptionRadioButton = new javax.swing.JRadioButton();
        secondOptionRadioButton = new javax.swing.JRadioButton();
        thirdOptionRadioButton = new javax.swing.JRadioButton();
        nextQuestionButton = new javax.swing.JButton();
        thirdObservationLabel = new javax.swing.JLabel();
        secondObservationLabel = new javax.swing.JLabel();
        firstObservation = new javax.swing.JLabel();
        liveLabel3 = new javax.swing.JLabel();
        liveLabel2 = new javax.swing.JLabel();
        liveLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inductiveIcons/question_1/icons8-sol-96.png"))); // NOI18N

        Icons2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inductiveIcons/question_1/summer_icon_96px.png"))); // NOI18N

        icons3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inductiveIcons/question_1/sunset_icon_96px.png"))); // NOI18N

        buttonGroup1.add(firstOptionRadioButton);
        firstOptionRadioButton.setText("jRadioButton1");

        buttonGroup1.add(secondOptionRadioButton);
        secondOptionRadioButton.setText("jRadioButton2");

        buttonGroup1.add(thirdOptionRadioButton);
        thirdOptionRadioButton.setText("jRadioButton3");

        nextQuestionButton.setText("jButton4");
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        thirdObservationLabel.setText("jLabel1");

        secondObservationLabel.setText("jLabel1");

        firstObservation.setText("jLabel1");

        liveLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondObservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thirdObservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstObservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(icon1)
                                .addGap(48, 48, 48)
                                .addComponent(firstOptionRadioButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Icons2)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(secondOptionRadioButton)
                                    .addComponent(thirdOptionRadioButton))))
                        .addContainerGap(469, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(icons3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextQuestionButton)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(liveLabel4)
                .addGap(18, 18, 18)
                .addComponent(liveLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liveLabel3)
                .addGap(88, 88, 88))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(liveLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(firstObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secondObservationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdObservationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(icon1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(firstOptionRadioButton)
                        .addGap(44, 44, 44)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Icons2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(secondOptionRadioButton)
                        .addGap(16, 16, 16)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(icons3)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(thirdOptionRadioButton)
                        .addGap(15, 15, 15)
                        .addComponent(nextQuestionButton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1302, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST
		// :event_nextQuestionButtonActionPerformed
		questions.removeFirst();
		if (questions.isEmpty()) {
			this.dispose();
		} else {
			loadQuestion();
		}
	}

	private void loadQuestion() {
		try {
			InductiveQuestion question = questions.getFirst();

			firstObservation.setText(question.getFirstObservation());
			secondObservationLabel.setText(question.getSecondObservation());
			thirdObservationLabel.setText(question.getThirdObservation());
			String[] options = ShuffleQuestion.shuffleOptions(question.getOptions())
				                   .split(",");
			for (int i = 0; i < options.length; i++) {
				switch (i) {
					case 0:
						firstOptionRadioButton.setText(options[i]);
						break;
					case 1:
						secondOptionRadioButton.setText(options[i]);
						break;
					case 2:
						thirdOptionRadioButton.setText(options[i]);
						break;
				}
			}
		} catch (NoSuchElementException e) {
			System.err.println("No more questions");
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Icons2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel firstObservation;
    private javax.swing.JRadioButton firstOptionRadioButton;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icons3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel liveLabel2;
    private javax.swing.JLabel liveLabel3;
    private javax.swing.JLabel liveLabel4;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel secondObservationLabel;
    private javax.swing.JRadioButton secondOptionRadioButton;
    private javax.swing.JLabel thirdObservationLabel;
    private javax.swing.JRadioButton thirdOptionRadioButton;
    // End of variables declaration//GEN-END:variables

	class BackGroundInductivePanel
		extends JPanel {

		private Image image;

		@Override
		public void paint(Graphics g) {
			image =
				new ImageIcon(getClass().getResource("/icons/backgroundImgs" +
				                                     "/background_principalForm.jpg")).getImage();

			g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

			setOpaque(false);

			super.paint(g);
		}
	}
}
