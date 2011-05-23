package models;

import play.modules.siena.Model;
import siena.Column;
import siena.Generator;
import siena.Id;
import siena.Table;
import siena.embed.Embedded;
import siena.embed.EmbeddedList;

@Table("container_models")
@EmbeddedList
public class ContainerModel extends Model{
    @Id(Generator.NONE)
    public String id;
    
    @Embedded
    @Column("embed")
    public EmbeddedModel embed;
    
    public String toString() {
    	return id + " " + embed;
    }
}
