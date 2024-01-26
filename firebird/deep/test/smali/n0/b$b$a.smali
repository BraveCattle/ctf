.class public final Ln0/b$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm0/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lm0/h;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm0/h;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, Ln0/b$b;

    invoke-direct {p1}, Ln0/b$b;-><init>()V

    return-object p1
.end method
