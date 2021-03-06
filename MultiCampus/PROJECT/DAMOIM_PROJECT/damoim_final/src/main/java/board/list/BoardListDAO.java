package board.list;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.MultipartFile;

public interface BoardListDAO {

	List<BoardListVO> boardList(String gath_no, String board_category);
	List<BoardListVO> boardsearchList(String gath_no, String date, String tag, String search);
	int insert(BoardListVO board);
	List<BoardListVO> category(String gath_no, String board_category);
	BoardListVO detailView(String board_no);
	int profileUpload(String gath_no, String board_no);
	int delete(String board_no);
	int update(BoardListVO board);
	int searchcount(String board_no);
}
