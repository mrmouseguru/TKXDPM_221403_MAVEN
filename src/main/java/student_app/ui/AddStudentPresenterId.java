package student_app.ui;

import student_app.usecase.AddStudentOutputBoundary;
import student_app.usecase.dto.AddStudentOutputDTO;

public class AddStudentPresenterId implements AddStudentOutputBoundary{
    private int newStudentId;
    private AddStudentOutputDTO  addStudentOutputDTO= null;

    @Override
    public void present(int newStudentId) {

        this.newStudentId = newStudentId;
    }

    public int getNewStudentId() {
        return newStudentId;
    }

    @Override
    public void present(AddStudentOutputDTO addStudentOutputDTO) {
        this.addStudentOutputDTO = addStudentOutputDTO;
        
    }

    public AddStudentOutputDTO getAddStudentOutputDTO() {
        return addStudentOutputDTO;
    }

}
