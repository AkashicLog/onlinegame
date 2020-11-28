package mapper;

import bean.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GameMapper {
    Game selectGamerByName(String name);
    Game selectGamerById(int gameid);
    List<Rank> gameRank(int gameid);
    List<Comment> commentList (int gameid);
    int insertGame(Game mygame);
}
