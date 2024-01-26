.class public Ln/d$b;
.super Ln/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ln/d;Ln/c;)V
    .locals 0

    invoke-direct {p0}, Ln/b;-><init>()V

    new-instance p1, Ln/i;

    invoke-direct {p1, p0, p2}, Ln/i;-><init>(Ln/b;Ln/c;)V

    iput-object p1, p0, Ln/b;->d:Ln/b$a;

    return-void
.end method
