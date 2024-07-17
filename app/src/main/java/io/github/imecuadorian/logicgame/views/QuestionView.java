/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this
 * license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package io.github.imecuadorian.logicgame.views;

import io.github.imecuadorian.logicgame.controller.DeductiveQuestionController;
import io.github.imecuadorian.logicgame.helpers.ShuffleQuestion;
import io.github.imecuadorian.logicgame.model.DeductiveQuestion;
import io.github.imecuadorian.logicgame.model.Player;
import io.github.imecuadorian.logicgame.model.Score;
import io.github.imecuadorian.logicgame.model.Time;
import io.github.imecuadorian.logicgame.services.DeductiveQuestionService;
import io.github.imecuadorian.logicgame.services.PlayerService;
import io.github.imecuadorian.logicgame.services.ScoreService;
import io.github.imecuadorian.logicgame.services.ScoreServiceImpl;

import javax.swing.*;
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
	private final PlayerService playerService;

	private final ScoreService scoreService;
	private final Player player;
	private final List<DeductiveQuestion> questions;
	private final int maxQuestions;

	private int points = 0;

	public QuestionView(
		java.awt.Frame parent,
		boolean modal,
		DeductiveQuestionService deductiveQuestionService,
		PlayerService playerService,
		Player player,
		ScoreService scoreService
	) {
		super(parent, modal);
		initComponents();
		this.deductiveQuestionController =
			new DeductiveQuestionController(deductiveQuestionService);
		this.questions = (List<DeductiveQuestion>) ShuffleQuestion.shuffleQuestions(
			deductiveQuestionController.getAll());
		this.maxQuestions = deductiveQuestionController.getSize();
		this.playerService = playerService;
		this.player = player;
		this.scoreService = scoreService;
		player.setLIFE((byte) 3);
		pointsLabel.setText("Points: " + points);
		if (maxQuestions == 0) {
			JOptionPane.showMessageDialog(this, "There are no questions available");
			this.dispose();
		} else {
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        firstOptionRadioButton = new javax.swing.JRadioButton();
        secondOptionRadioButton = new javax.swing.JRadioButton();
        thirdOptionRadioButton = new javax.swing.JRadioButton();
        nextQuestionButton = new javax.swing.JButton();
        thirdPremiseLabel = new javax.swing.JLabel();
        secondPremiseLabel = new javax.swing.JLabel();
        firstPremiseLabel = new javax.swing.JLabel();
        pointsLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        liveLabel4 = new javax.swing.JLabel();
        liveLabel2 = new javax.swing.JLabel();
        liveLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 600));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jPanel2.setBackground(new java.awt.Color(59, 23, 66));

        buttonGroup1.add(firstOptionRadioButton);
        firstOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstOptionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        firstOptionRadioButton.setText("jRadioButton1");

        buttonGroup1.add(secondOptionRadioButton);
        secondOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondOptionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        secondOptionRadioButton.setText("jRadioButton2");

        buttonGroup1.add(thirdOptionRadioButton);
        thirdOptionRadioButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thirdOptionRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        thirdOptionRadioButton.setText("jRadioButton3");

        nextQuestionButton.setBackground(new java.awt.Color(59, 23, 66));
        nextQuestionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deductiveIcons/icons_ok_hand_question_view_100px.png"))); // NOI18N
        nextQuestionButton.setToolTipText("Siguiente");
        nextQuestionButton.setBorderPainted(false);
        nextQuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQuestionButtonActionPerformed(evt);
            }
        });

        thirdPremiseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        thirdPremiseLabel.setForeground(new java.awt.Color(255, 255, 255));
        thirdPremiseLabel.setText("jLabel1");

        secondPremiseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        secondPremiseLabel.setForeground(new java.awt.Color(255, 255, 255));
        secondPremiseLabel.setText("jLabel1");

        firstPremiseLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstPremiseLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstPremiseLabel.setText("jLabel1");

        pointsLabel.setFont(new java.awt.Font("MS Gothic", 3, 18)); // NOI18N
        pointsLabel.setForeground(new java.awt.Color(255, 255, 255));
        pointsLabel.setText("Puntos:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/deductiveIcons/icon_whale_100px.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(59, 23, 66));

        liveLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        liveLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hearth_icon_50px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(liveLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liveLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liveLabel3)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liveLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(liveLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pointsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thirdPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(secondPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPremiseLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstOptionRadioButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondOptionRadioButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(thirdOptionRadioButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(447, 447, 447)
                .addComponent(nextQuestionButton)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(pointsLabel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(firstPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(thirdPremiseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firstOptionRadioButton)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(secondOptionRadioButton)
                                .addGap(52, 52, 52)
                                .addComponent(thirdOptionRadioButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1)))
                        .addGap(32, 32, 32))
                    .addComponent(nextQuestionButton))
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

	private void nextQuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST
		// :event_nextQuestionButtonActionPerformed
		if (!firstOptionRadioButton.isSelected() && !secondOptionRadioButton.isSelected() &&
		    !thirdOptionRadioButton.isSelected()) {
			JOptionPane.showMessageDialog(this, "Please select an option");
			return;
		}

		String selectedOption;
		if (firstOptionRadioButton.isSelected()) {
			selectedOption = firstOptionRadioButton.getText();
		} else if (secondOptionRadioButton.isSelected()) {
			selectedOption = secondOptionRadioButton.getText();
		} else {
			selectedOption = thirdOptionRadioButton.getText();
		}
		DeductiveQuestion question = questions.getFirst();

		if (question.getCorrectOption()
			    .equals(selectedOption)) {
			resetOptions();
			points++;
			pointsLabel.setText("Points: " + points);
		} else {
			resetOptions();
			player.reduceLife();
			if (player.getLIFE() == 2) {
				liveLabel4.setVisible(false);
			} else if (player.getLIFE() == 1) {
				liveLabel3.setVisible(false);
			} else {
				liveLabel2.setVisible(false);
			}
			if (!checkHasLives()) {
				JOptionPane.showMessageDialog(this, "Game Over");
				JOptionPane.showMessageDialog(this, "Points: " + points);
				this.dispose();
				Score score = new Score();
				score.setPlayerId(player.getId());
				score.setTypeGameId(1);
				score.setScore(points);
				((ScoreServiceImpl) scoreService).update(player, points);
			}
		}

		questions.removeFirst();
		if (questions.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Congratulations, you have completed the game!");
			JOptionPane.showMessageDialog(this, "Points: " + points + " of " + maxQuestions);
			this.dispose();
			Score score = new Score();
			score.setPlayerId(player.getId());
			score.setTypeGameId(1);
			score.setScore(points);
			((ScoreServiceImpl) scoreService).update(player, points);
		} else {
			resetOptions();
			loadQuestion();
		}
	}

	private DeductiveQuestion loadQuestion() {
		resetOptions();
		DeductiveQuestion question = questions.getFirst();
		firstPremiseLabel.setText(question.getFirstPremise());
		secondPremiseLabel.setText(question.getSecondPremise());
		thirdPremiseLabel.setText(question.getConclusion());
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


		return question;
	}

	private void resetOptions() {
		buttonGroup1.clearSelection();
	}

	private boolean checkHasLives() {
		return player.getLIFE() > 0;
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton firstOptionRadioButton;
    private javax.swing.JLabel firstPremiseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel liveLabel2;
    private javax.swing.JLabel liveLabel3;
    private javax.swing.JLabel liveLabel4;
    private javax.swing.JButton nextQuestionButton;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JRadioButton secondOptionRadioButton;
    private javax.swing.JLabel secondPremiseLabel;
    private javax.swing.JRadioButton thirdOptionRadioButton;
    private javax.swing.JLabel thirdPremiseLabel;
    // End of variables declaration//GEN-END:variables
}

