package com.senai.escola.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "audit_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private LocalDateTime instante;
    
    private String usuario;
    
    private Long empresaId;
    
    private String acao; // Ex: CREATE, UPDATE, DELETE
    
    private String entidade; // Ex: "Lancamento", "NotaFiscal"
    
    private Long entityId;
    
    @Column(columnDefinition = "TEXT")
    private String payload;
}