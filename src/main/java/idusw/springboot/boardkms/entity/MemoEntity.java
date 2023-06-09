package idusw.springboot.boardkms.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "a_memo")

@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long mNo;

    @Column(length = 200, nullable = false)
    private String memoText;
}
