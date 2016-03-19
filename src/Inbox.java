import java.util.ArrayList;
import java.util.List;

/**
 * Observable
 */
public class Inbox
{
  /**
   * Lista de dispositivos que observam a caixa de entrada
   */
  private List<Subscriber> subscribers;
  
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
  /**
   * Construtor padrao
   */
  public Inbox()
  {
    this.subscribers = new ArrayList<Subscriber>();
  }
  
  /**
   * Receber um novo e-mail
   * 
   * @param email e-mail
   */
  public void addEmail(Email email)
  {
    for(Subscriber subscriber: this.subscribers)
    {
      subscriber.update(email);
    }
  }
  
  /**
   * Acrescentar o dispositivo a lista
   * 
   * @param subscriber dispositivo
   */
  public void attach(Subscriber subscriber)
  {
    this.subscribers.add(subscriber);
  }
  
  /**
   * Retirar o dispositivo da lista
   * 
   * @param subscriber dispositivo
   */
  public void detach(Subscriber subscriber)
  {
    this.subscribers.remove(subscriber);
  }
}