package pl.supra.secret;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/note")
public class NoteFindController extends HttpServlet {
    private final NoteDao noteDao = new NoteDao();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("title") == null){
            response.sendError(404);
            request.getRequestDispatcher("/WEB-INF/accessform.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String noteTitle = request.getParameter("title");
        String password = request.getParameter("password");
        Optional<Note> note = noteDao.findByTitleAndPassword(noteTitle, password);
        note.ifPresent(n->request.setAttribute("note", note));
        note.map(n->request.getRequestDispatcher("/WEB-INF/note.jsp"))
                .orElseGet(()->request.getRequestDispatcher("/WEB-INF/accessdeniede.jsp"))
                .forward(request, response);
    }
}
