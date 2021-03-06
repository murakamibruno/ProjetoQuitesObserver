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
 * ConcreteObservable
 */
public class Cellphone implements Subscriber
{
  /* (non-Javadoc)
   * @see com.ybadoo.tutoriais.poo.Subscriber#update(com.ybadoo.tutoriais.poo.Email)
   */
  public void update(Email email)
  {
    System.out.println("Cellphone: " + email.getSubject() + " from " + email.getSender());
  }
}