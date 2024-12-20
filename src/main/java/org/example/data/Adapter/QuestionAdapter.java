package org.example.data.Adapter;


//Adapter for converting quiz formats (e.g., export to JSON/XML).

import org.example.data.Model.Question;

public interface QuestionAdapter {

    String convertToJson(Question question);

    String convertToXml(Question question);


}
