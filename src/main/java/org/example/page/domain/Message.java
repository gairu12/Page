package org.example.page.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String content;
    private String tag;


    @ManyToOne(fetch = FetchType.EAGER)
    private User author;
    private String fileName;

    public Message(String content, String tag, User user) {
        this.author = user;
        this.content = content;
        this.tag = tag;
    }

    public String getAuthorName() {
        return author != null ? author.getUsername() : "<none>";
    }
}
