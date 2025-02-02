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
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import io.github.imecuadorian.logicgame.services.InductiveQuestionService;
import io.github.imecuadorian.logicgame.services.ScoreService;
import io.github.imecuadorian.logicgame.services.ScoreServiceImpl;

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

	private final ScoreService scoreService;
	private final List<InductiveQuestion> questions;

	private final Player player;
	private final int maxQuestions;

	private int points = 0;

	public QuestionInductiveView(
		java.awt.Frame parent,
		boolean modal,
		InductiveQuestionService inductiveQuestionService,
		ScoreService scoreService,
		Player player
	) {
		super(parent, modal);
		initComponents();
		this.inductiveQuestionController =
			new InductiveQuestionController(inductiveQuestionService);
		this.questions = (List<InductiveQuestion>) ShuffleQuestion.shuffleQuestions(
			inductiveQuestionController.getAll());
		this.maxQuestions = inductiveQuestionController.getSize();
		this.scoreService = scoreService;
		this.player = player;
		player.setLIFE((byte) 3);

		if (questions.isEmpty()) {
			JOptionPane.showMessageDialog(this, "No questions available");
			this.dispose();
		}		else {
			loadQuestion();
		}

	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT
	 * modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        liveLabel4 = new javax.swing.JLabel();
        liveLabel2 = new javax.swing.JLabel();
        liveLabel3 = new javax.swing.JLabel();
        firstObservation = new javax.swing.JLabel();
        secondObservationLabel = new javax.swing.JLabel();
        thirdObservationLabel = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        firstOptionRadioButton = new javax.swing.JRadioButton();
        secondOptionRadioButton = new javax.swing.JRadioButton();
        thirdOptionRadioButton = new javax.swing.JRadioButton();
        nextQuestionButton = new javax.swing.JButton();
        pointsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel3.setBackground(new java.awt.Color(240, 194, 123));

        jPanel4.setBackground(new java.awt.Color(240, 194, 123));

        liveLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(liveLabel4)
                .addGap(26, 26, 26)
                .addComponent(liveLabel2)
                .addGap(18, 18, 18)
                .addComponent(liveLabel3)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(liveLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        firstObservation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstObservation.setText("jLabel1");

        secondObservationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondObservationLabel.setText("jLabel1");

        thirdObservationLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thirdObservationLabel.setText("jLabel1");

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inductiveIcons/question_1/icons8-sol-96.png"))); // NOI18N

        buttonGroup1.add(firstOptionRadioButton);
        firstOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstOptionRadioButton.setText("jRadioButton1");

        buttonGroup1.add(secondOptionRadioButton);
        secondOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondOptionRadioButton.setText("jRadioButton2");

        buttonGroup1.add(thirdOptionRadioButton);
        thirdOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thirdOptionRadioButton.setText("jRadioButton3");

        nextQuestionButton.setBackground(new java.awt.Color(240, 194, 123));
        nextQuestionButton.setForeground(new java.awt.Color(240, 194, 123));
        nextQuestionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/inductiveIcons/icon_ok_hand_100px.png"))); // NOI18N
        nextQuestionButton.setBorderPainted(false);
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        pointsLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pointsLabel.setText("Puntos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(icon1)
                .addGap(133, 133, 133)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(firstObservation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(233, 233, 233))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(secondObservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(thirdObservationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(thirdOptionRadioButton)
                    .addComponent(secondOptionRadioButton)
                    .addComponent(firstOptionRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 411, Short.MAX_VALUE)
                .addComponent(nextQuestionButton)
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pointsLabel)
                            .addComponent(icon1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(firstObservation, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secondObservationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdObservationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(firstOptionRadioButton)
                        .addGap(26, 26, 26)
                        .addComponent(secondOptionRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(thirdOptionRadioButton))
                    .addComponent(nextQuestionButton))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST
		// :event_nextQuestionButtonActionPerformed

		if(!firstOptionRadioButton.isSelected() && !secondOptionRadioButton.isSelected() && !thirdOptionRadioButton.isSelected()){
			JOptionPane.showMessageDialog(this, "Please select an option");
			return;
		}

		InductiveQuestion question = questions.getFirst();
		String correctAnswer = question.getCorrectOption();
		String selectedAnswer = "";
		if (firstOptionRadioButton.isSelected()) {
			selectedAnswer = firstOptionRadioButton.getText();
		} else if (secondOptionRadioButton.isSelected()) {
			selectedAnswer = secondOptionRadioButton.getText();
		} else if (thirdOptionRadioButton.isSelected()) {
			selectedAnswer = thirdOptionRadioButton.getText();
		}

		if (correctAnswer.equals(selectedAnswer)) {
			points++;
			resetOptions();
			pointsLabel.setText("Puntos: " + points);
		} else {
			player.reduceLife();
			if (player.getLIFE() == 2) {
				liveLabel3.setVisible(false);
			} else if (player.getLIFE() == 1) {
				liveLabel2.setVisible(false);
			} else if (player.getLIFE() == 0) {
				liveLabel4.setVisible(false);
				JOptionPane.showMessageDialog(this, "Game Over");
				this.dispose();
			}

			if(!checkHasLives()){
				JOptionPane.showMessageDialog(this, "Game Over");
				this.dispose();
				Score score = new Score();
				score.setScore(points);
				score.setLevel(maxQuestions);
				score.setPlayerId(player.getId());
				score.setTypeGameId(2);
				((ScoreServiceImpl) scoreService).update(player, points);
			}

		}


		questions.removeFirst();
		if (questions.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Congratulations, you have completed the game");
			Score score = new Score();
			score.setScore(points);
			score.setLevel(maxQuestions);
			score.setPlayerId(player.getId());
			score.setTypeGameId(2);
			((ScoreServiceImpl) scoreService).update(player, points);
			this.dispose();
		} else {
			resetOptions();
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

	private void resetOptions(){
		buttonGroup1.clearSelection();
	}

	private boolean checkHasLives() {
		return player.getLIFE() > 0;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel firstObservation;
    private javax.swing.JRadioButton firstOptionRadioButton;
    private javax.swing.JLabel icon1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel liveLabel2;
    private javax.swing.JLabel liveLabel3;
    private javax.swing.JLabel liveLabel4;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JLabel secondObservationLabel;
    private javax.swing.JRadioButton secondOptionRadioButton;
    private javax.swing.JLabel thirdObservationLabel;
    private javax.swing.JRadioButton thirdOptionRadioButton;
    // End of variables declaration//GEN-END:variables

	
}
