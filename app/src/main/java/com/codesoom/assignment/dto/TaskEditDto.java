package com.codesoom.assignment.dto;

/**
 * Task 수정에 필요한 데이터를 보유하는 객체입니다.
 */
public class TaskEditDto {

    private String title;

    public TaskEditDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }
}
