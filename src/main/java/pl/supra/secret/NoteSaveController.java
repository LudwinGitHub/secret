package pl.supra.secret;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/save")
public class NoteSaveController extends HttpServlet {
    private final NoteDao noteDao = new NoteDao();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Note note = getNoteFromParameter(request);
        noteDao.save(note);
        request.setAttribute("note", note);
        request.getRequestDispatcher("/WEB-INF/confirm.jsp").forward(request, response);
    }

    private Note getNoteFromParameter(HttpServletRequest request) {
        String title = request.getParameter("title");
        String password = request.getParameter("password");
        String content = request.getParameter("content");
        return new Note(title, password, content);
    }
}
