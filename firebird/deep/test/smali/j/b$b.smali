.class public Lj/b$b;
.super Lj/b$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lj/b$e<",
        "TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lj/b$c;Lj/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b$c<",
            "TK;TV;>;",
            "Lj/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lj/b$e;-><init>(Lj/b$c;Lj/b$c;)V

    return-void
.end method


# virtual methods
.method public b(Lj/b$c;)Lj/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b$c<",
            "TK;TV;>;)",
            "Lj/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lj/b$c;->c:Lj/b$c;

    return-object p1
.end method

.method public c(Lj/b$c;)Lj/b$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b$c<",
            "TK;TV;>;)",
            "Lj/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object p1, p1, Lj/b$c;->d:Lj/b$c;

    return-object p1
.end method
