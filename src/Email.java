/**
 * Copyright (C) 2009/2016 - Cristiano Lehrer (cristiano@ybadoo.com.br)
 *                  Ybadoo - Solucoes em Software Livre (www.ybadoo.com.br)
 *
 * Permission is granted to copy, distribute and/or modify this document
 * under the terms of the GNU Free Documentation License, Version 1.3
 * or any later version published by the Free Software Foundation; with
 * no Invariant Sections, no Front-Cover Texts, and no Back-Cover Texts.
 * A copy of the license is included in the section entitled "GNU
 * Free Documentation License".
 */
public class Email
{
  /**
   * Destinatario do e-mail
   */
  private String receiver;
  
  /**
   * Remetente do e-mail
   */
  private String sender;
  
  /**
   * Assunto do e-mail
   */
  private String subject;
  
  /**
   * Texto do e-mail
   */
  private String text;
  
  /**
   * Construtor para inicializar o e-mail
   * 
   * @param sender remetente do e-mail
   * @param receiver destinatario do e-mail
   * @param subject assunto do e-mail
   * @param text texto do e-mail
   */
  public Email(String sender, String receiver, String subject, String text)
  {
    this.sender = sender;
    this.receiver = receiver;
    this.subject = subject;
    this.text = text;
  }

  /**
   * Retornar o destinatario do e-mail
   * 
   * @return destinatario do e-mail
   */
  public String getReceiver()
  {
    return this.receiver;
  }

  /**
   * Retornar o remetente do e-mail
   * 
   * @return remetente do e-mail
   */
  public String getSender()
  {
    return this.sender;
  }

  /**
   * Retornar o assunto do e-mail
   * 
   * @return assunto do e-mail
   */
  public String getSubject()
  {
    return this.subject;
  }

  /**
   * Retornar o texto do e-mail
   * 
   * @return texto do e-mail
   */
  public String getText()
  {
    return this.text;
  }
}