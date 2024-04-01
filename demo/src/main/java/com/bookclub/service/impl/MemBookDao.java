package main.java.com.bookclub.service.impl;

import main.java.com.bookclub.model.Book;
import main.java.com.bookclub.service.dao.BookDao;

import java.util.ArrayList;
import java.util.List;

public class MemBookDao implements BookDao {

    private List<Book> books;

    public MemBookDao() {
        this.books = new ArrayList<Book>();
        this.books.add(new Book("1974738701", "One Piece, Vol. 103", "As Sanji and Zolo defeat the two remaining Lead Performers of the Animal Kingdom pirates, the battle intensifies between Luffy and Kaido! Meanwhile, Kid and Law are locked in a furious melee with Big Mom. Can the upstarts defeat two reigning Emperors of the Sea?!", 232, new ArrayList<>(List.of("Echira Oda"))));
        this.books.add(new Book("1974704424", "Demon Slayer: Kimetsu no Yaiba, Vol. 8", "In Taisho-era Japan, Tanjiro Kamado is a kindhearted boy who makes a living selling charcoal. But his peaceful life is shattered when a demon slaughters his entire family. His little sister Nezuko is the only survivor, but she has been transformed into a demon herself! Tanjiro sets out on a dangerous journey to find a way to return his sister to normal and destroy the demon who ruined his life.\n" +
                "\n" +
                "After dealing with several demonic enemies aboard the Infinity Train, Tanjiro, Zenitsu and Inosuke must face the demon spirit of the train itself! Even if they can stop the demon train, the minions of Muzan Kibutsuji are still out there and Tanjiro must continue to improve his strength and skills. Learning the secret of the Hikonami Kagura and Flame Breathing will give him a powerful new advantage.", 192, new ArrayList<>(List.of("Koyoharu Gotouge"))));
        this.books.add(new Book("1974722848", "Jujutsu Kaisen, Vol. 11", "In a world where cursed spirits feed on unsuspecting humans, fragments of the legendary and feared demon Ryomen Sukuna have been lost and scattered about. Should any demon consume Sukuna’s body parts, the power they gain could destroy the world as we know it. Fortunately, there exists a mysterious school of jujutsu sorcerers who exist to protect the precarious existence of the living from the supernatural!\n" +
                "\n" +
                "Despite the crowd of civilians and transfigured humans, Satoru Gojo is able to defeat the cursed spirits at Shibuya Station. But it’s a trap! The cursed spirits possess a special item that can even seal the all-powerful Gojo! Meanwhile, an unlikely ally suddenly contacts Yuji Itadori, who is on his way to the station!", 4192, new ArrayList<>(List.of("Gege Akutami"))));
    }
    @Override
    public List<Book> list() {
        return this.books;
    }

    @Override
    public Book find(String key) {
        for (Book book : this.books) {
            if (book.getIsbn().equals(key)) {
                return book;
            }
        }
        return new Book();
    }
}
