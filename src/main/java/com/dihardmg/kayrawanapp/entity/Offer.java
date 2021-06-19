package com.dihardmg.kayrawanapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;
import lombok.ToString;

/**
 * @author : Otorus
 * @since : 1/4/18
 */
@Data
@ToString(exclude = "listAlamat")
@Entity
@Table(name = "offer",
        indexes = {
                @Index(columnList = "offer_id", name = "offer_id_idx"),
                @Index(columnList = "offer_name", name = "offer_name_idx")
        })
public class Offer {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @NotEmpty
    @NotNull
    @Column(name="offer_id", nullable = false)
    private String offerId;

    @NotEmpty
    @Size(max = 255)
    @Column(name="offer_name", nullable = false)
    private String offerName;

}
