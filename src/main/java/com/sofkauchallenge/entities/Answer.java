package com.sofkauchallenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "answer", nullable = false, length = 200)
    private String answer;

    @Column(name = "is_correct", nullable = false)
    private Integer isCorrect;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    public Integer getId() {
        return id;
    }

    public Answer setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getAnswer() {
        return answer;
    }

    public Answer setAnswer(String answer) {
        this.answer = answer;
        return this;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public Answer setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
        return this;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer setQuestion(Question question) {
        this.question = question;
        return this;
    }

}