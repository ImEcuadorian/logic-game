/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package io.github.imecuadorian.logicgame.views;

import io.github.imecuadorian.logicgame.controller.DeductiveQuestionController;
import io.github.imecuadorian.logicgame.helpers.ShuffleQuestion;
import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;

import java.util.List;

/**
 * @author Hugo Saldarriaga
 */
public class QuestionView
	extends javax.swing.JDialog {

	/**
	 * Creates new form QuestionView
	 */

	private final DeductiveQuestionController deductiveQuestionController;
	private final List<DeductiveQuestion> questions;
	private final int maxQuestions;

	public QuestionView(
		java.awt.Frame parent,
		boolean modal,
		DeductiveQuestionService deductiveQuestionService
	) {
		super(parent, modal);
		initComponents();
		this.deductiveQuestionController =
                new DeductiveQuestionController(deductiveQuestionService);
		this.questions = (List<DeductiveQuestion>) ShuffleQuestion.shuffleQuestions(deductiveQuestionController.getAll());
		this.maxQuestions = deductiveQuestionController.getSize();
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
		secondPremiseLabel = new javax.swing.JLabel();
		thirdPremiseLabel = new javax.swing.JLabel();
		firstPremiseLabel = new javax.swing.JLabel();
		firstOptionRadioButton = new javax.swing.JRadioButton();
		secondOptionRadioButton = new javax.swing.JRadioButton();
		thirdOptionRadioButton = new javax.swing.JRadioButton();
		nextQuestionButton = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		secondPremiseLabel.setText("jLabel1");

		thirdPremiseLabel.setText("jLabel1");

		firstPremiseLabel.setText("jLabel1");

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

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					          .addContainerGap()
					          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						                    .addComponent(
							                    secondPremiseLabel,
							                    javax.swing.GroupLayout.DEFAULT_SIZE,
							                    javax.swing.GroupLayout.DEFAULT_SIZE,
							                    Short.MAX_VALUE)
						                    .addComponent(
							                    thirdPremiseLabel,
							                    javax.swing.GroupLayout.DEFAULT_SIZE,
							                    869,
							                    Short.MAX_VALUE))
					          .addContainerGap())
				.addGroup(layout.createSequentialGroup()
					          .addGap(136, 136, 136)
					          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						                    .addComponent(thirdOptionRadioButton)
						                    .addComponent(secondOptionRadioButton)
						                    .addComponent(firstOptionRadioButton))
					          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                               Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                          layout.createSequentialGroup()
					                                                      .addContainerGap(
						                                                      javax.swing.GroupLayout.DEFAULT_SIZE,
						                                                      Short.MAX_VALUE)
					                                                      .addComponent(nextQuestionButton)
					                                                      .addGap(103, 103, 103))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					          .addGroup(layout.createSequentialGroup()
						                    .addContainerGap()
						                    .addComponent(
							                    firstPremiseLabel,
							                    javax.swing.GroupLayout.DEFAULT_SIZE,
							                    869,
							                    Short.MAX_VALUE)
						                    .addContainerGap()))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					          .addGap(113, 113, 113)
					          .addComponent(
						          secondPremiseLabel,
						          javax.swing.GroupLayout.PREFERRED_SIZE,
						          67,
						          javax.swing.GroupLayout.PREFERRED_SIZE)
					          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					          .addComponent(
						          thirdPremiseLabel,
						          javax.swing.GroupLayout.PREFERRED_SIZE,
						          67,
						          javax.swing.GroupLayout.PREFERRED_SIZE)
					          .addGap(114, 114, 114)
					          .addComponent(firstOptionRadioButton)
					          .addGap(40, 40, 40)
					          .addComponent(secondOptionRadioButton)
					          .addGap(51, 51, 51)
					          .addComponent(thirdOptionRadioButton)
					          .addPreferredGap(
						          javax.swing.LayoutStyle.ComponentPlacement.RELATED,
						          33,
						          Short.MAX_VALUE)
					          .addComponent(nextQuestionButton)
					          .addGap(53, 53, 53))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					          .addGroup(layout.createSequentialGroup()
						                    .addGap(62, 62, 62)
						                    .addComponent(
							                    firstPremiseLabel,
							                    javax.swing.GroupLayout.PREFERRED_SIZE,
							                    67,
							                    javax.swing.GroupLayout.PREFERRED_SIZE)
						                    .addContainerGap(501, Short.MAX_VALUE)))
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
	}//GEN-LAST:event_nextQuestionButtonActionPerformed

	private void loadQuestion() {
		DeductiveQuestion question = questions.getFirst();
		firstPremiseLabel.setText(question.getFirstPremise());
		secondPremiseLabel.setText(question.getSecondPremise());
		thirdPremiseLabel.setText(question.getConclusion());
		String[] options = ShuffleQuestion.shuffleOptions(question.getOptions()).split(",");
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
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.JRadioButton firstOptionRadioButton;
	private javax.swing.JLabel firstPremiseLabel;
	private javax.swing.JButton nextQuestionButton;
	private javax.swing.JRadioButton secondOptionRadioButton;
	private javax.swing.JLabel secondPremiseLabel;
	private javax.swing.JRadioButton thirdOptionRadioButton;
	private javax.swing.JLabel thirdPremiseLabel;
	// End of variables declaration//GEN-END:variables
}
